package com.shellrean.barang.repository;

import com.shellrean.barang.domain.dao.Ship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShipRepository extends JpaRepository<Ship, Long> {
    List<Ship> findByBarangId(Long id);
}
