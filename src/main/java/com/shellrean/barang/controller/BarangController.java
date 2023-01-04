package com.shellrean.barang.controller;

import com.shellrean.barang.domain.dao.Barang;
import com.shellrean.barang.domain.dao.Ship;
import com.shellrean.barang.service.BarangService;
import com.shellrean.barang.service.ShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class BarangController {
    @Autowired
    private BarangService barangService;

    @Autowired
    private ShipService shipService;

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

    @GetMapping("barang/{id}/ship")
    public List<Ship> getBarangShip(@PathVariable Long id) {
        return shipService.getShipByBarang(id);
    }
}
