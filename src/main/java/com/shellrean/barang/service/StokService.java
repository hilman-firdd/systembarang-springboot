package com.shellrean.barang.service;

import com.shellrean.barang.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StokService {
    @Autowired
    private StockRepository stockRepository;
}
