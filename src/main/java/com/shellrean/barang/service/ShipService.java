package com.shellrean.barang.service;

import com.shellrean.barang.repository.ShipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShipService {
    @Autowired
    private ShipRepository shipRepository;
}
