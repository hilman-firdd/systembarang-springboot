package com.shellrean.barang.domain.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table (name = "tbl_barang")
public class Barang {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nama;

    private String kategori;

    private Integer berat;
}
