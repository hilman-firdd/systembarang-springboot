package com.shellrean.barang.repository;

import com.shellrean.barang.domain.dao.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
@Transactional
public interface StockRepository extends JpaRepository<Stock, Long> {
    public void deleteByBarangId(Long id);
    public Optional<Stock> findByBarangId(Long id);
}
