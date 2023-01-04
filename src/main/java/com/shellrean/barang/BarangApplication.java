package com.shellrean.barang;

import com.shellrean.barang.constant.TipeBarangConstant;
import com.shellrean.barang.domain.dao.Barang;
import com.shellrean.barang.domain.dao.Stock;
import com.shellrean.barang.repository.BarangRepository;
import com.shellrean.barang.repository.StockRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class BarangApplication {

	public static void main(String[] args) {
		SpringApplication.run(BarangApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(BarangRepository barangRepository, StockRepository stockRepository) {
		return (args) -> {
//			Barang barang1 = new Barang();
//			barang1.setNama("Pakaian Anak");
//			barang1.setBerat(1);
//			barang1.setKategori(TipeBarangConstant.TIPE_PAKAIAN);
//			barang1.setId(1);
// 			barangRepository.save(barang1);

			Barang barang1 = Barang.builder()
							.id(1l)
							.nama("Pakaian Anak")
							.berat(1)
							.kategori(TipeBarangConstant.TIPE_PAKAIAN)
							.build();
			Barang barang2 = Barang.builder()
							.id(2l)
							.nama("Komputer")
							.berat(2)
							.kategori(TipeBarangConstant.TIPE_ELEKTRONIK)
							.build();

			Stock stok1 = Stock.builder()
						.barangId(1l)
						.id(1l)
						.stok(0)
						.build();
			Stock stok2 = Stock.builder()
						.barangId(2l)
						.id(2l)
						.stok(0)
						.build();

			barangRepository.saveAll(List.of(barang1, barang2));
			stockRepository.saveAll(List.of(stok1, stok2));
		};
	}
}
