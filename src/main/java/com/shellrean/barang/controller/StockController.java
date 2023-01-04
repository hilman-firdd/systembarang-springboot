package com.shellrean.barang.controller;

import com.shellrean.barang.domain.dao.Stock;
import com.shellrean.barang.domain.dto.StockShipRqDTO;
import com.shellrean.barang.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class StockController {
    @Autowired
    private StockService stokService;

    @PostMapping("stock")
    public Stock saveStock(@RequestBody StockShipRqDTO req) {
        return stokService.addStockShip(req);
    }
}
