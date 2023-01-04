package com.shellrean.barang.service;

import com.shellrean.barang.domain.dao.Ship;
import com.shellrean.barang.repository.ShipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipService {
    @Autowired
    private ShipRepository shipRepository;

    public List<Ship> getShipByBarang(Long id) {
        return shipRepository.findByBarangId(id);
    }
}
