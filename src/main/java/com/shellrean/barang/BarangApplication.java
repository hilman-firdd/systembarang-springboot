package com.shellrean.barang;

import com.shellrean.barang.constant.TipeBarangConstant;
import com.shellrean.barang.domain.dao.Barang;
import com.shellrean.barang.repository.BarangRepository;
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
	CommandLineRunner commandLineRunner(BarangRepository barangRepository) {
		return (args) -> {
//			Barang barang1 = new Barang();
//			barang1.setNama("Pakaian Anak");
//			barang1.setBerat(1);
//			barang1.setKategori(TipeBarangConstant.TIPE_PAKAIAN);
//			barang1.setId(1);
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

//			barangRepository.save(barang1);
			barangRepository.saveAll(List.of(barang1, barang2));
		};
	}
}
