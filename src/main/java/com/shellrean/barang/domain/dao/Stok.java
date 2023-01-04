package com.shellrean.barang.domain.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_stok")
public class Stok {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long barangId;

    private Integer stok;
}
