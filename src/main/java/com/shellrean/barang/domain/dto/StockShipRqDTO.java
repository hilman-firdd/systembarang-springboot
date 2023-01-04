package com.shellrean.barang.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockShipRqDTO {
    private Long barangId;
    private Integer stock;
    private String tipe;
}
