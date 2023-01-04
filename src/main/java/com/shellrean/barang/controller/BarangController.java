package com.shellrean.barang.controller;

import com.shellrean.barang.domain.dao.Barang;
import com.shellrean.barang.service.BarangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class BarangController {
    @Autowired
    private BarangService barangService;

    @GetMapping("barang")
    public List<Barang> getAllBarang() {
        return barangService.getAllBarang();
    }

    @PostMapping("barang")
    public Barang saveBarang(@RequestBody Barang barang){
        return barangService.saveBarang(barang);
    }

    @PutMapping("barang")
    public Barang updateBarang(@RequestBody Barang barang){
        return barangService.saveBarang(barang);
    }

    @DeleteMapping("barang/{id}")
    public void deleteBarang(@PathVariable Long id){
        barangService.deleteBarang(id);
    }
}
