package com.shellrean.barang.repository;

import com.shellrean.barang.domain.dao.Stok;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends JpaRepository<Stok, Long> {
}
