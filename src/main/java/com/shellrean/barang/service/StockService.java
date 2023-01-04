package com.shellrean.barang.service;

import com.shellrean.barang.constant.ShipTipeConstant;
import com.shellrean.barang.domain.dao.Ship;
import com.shellrean.barang.domain.dao.Stock;
import com.shellrean.barang.domain.dto.StockShipRqDTO;
import com.shellrean.barang.repository.ShipRepository;
import com.shellrean.barang.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class StockService {
    @Autowired
    private StockRepository stockRepository;

    @Autowired
    private ShipRepository shipRepository;

    public Stock saveStok(Stock stock){
        return stockRepository.save(stock);
    }

    public void deleteStokByBarang(Long id){
        stockRepository.deleteByBarangId(id);
    }

    public Stock addStockShip(StockShipRqDTO req) {
        Optional<Stock> stockOpt = stockRepository.findByBarangId(req.getBarangId());
        if(!stockOpt.isPresent()) {
            throw new RuntimeException("stock not found");
        }

        Stock stock = stockOpt.get();

        Ship ship = Ship.builder()
                .barangId(req.getBarangId())
                .stok(req.getStock())
                .tipe(req.getTipe())
                .tanggal(new Date())
                .build();
        shipRepository.save(ship);

        switch (req.getTipe()) {
            case ShipTipeConstant.TIPE_IN:
                stock.setStok(stock.getStok() + req.getStock());
                break;
            case ShipTipeConstant.TIPE_OUT:
                if (stock.getStok() < req.getStock()) {
                    throw new RuntimeException("error stock tidak tersedia");
                }

                stock.setStok(stock.getStok() - req.getStock());
                break;
            default:
                throw new RuntimeException("error in tipe");
        }

        return stockRepository.save(stock);
    }
}
