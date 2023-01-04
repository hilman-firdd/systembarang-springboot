package com.shellrean.barang.service;

import com.shellrean.barang.domain.dao.Barang;
import com.shellrean.barang.repository.BarangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Service
@RequestMapping("api")
public class BarangService {

    @Autowired
    private BarangRepository barangRepository;

    public List<Barang> getAllBarang() {
        return barangRepository.findAll();
    }

    public Barang saveBarang(Barang barang) {
        return barangRepository.save(barang);
    }

    public void deleteBarang(Long id){
        Optional<Barang> barangOpt = barangRepository.findById(id);
        if(!barangOpt.isPresent()){
            throw new RuntimeException("Barang tidak ditemukan");
        }
        barangRepository.deleteById(id);
    }
}
