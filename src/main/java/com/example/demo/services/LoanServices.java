package com.example.demo.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.models.LoanModel;

@Service
public class LoanServices {
	// public ArrayList<Double> CicilanBulan(BigDecimal pokok, double tenor, double
	// bunga) {
	// double pokokbulan = pokok.doubleValue()/12;
	// double bungabulan = pokokbulan * bunga;
	// double cicilan = pokokbulan + bungabulan;
	// ArrayList<Double> List = new ArrayList<Double>();
	// for (int i = 0; i < tenor; i++) {
	// List.add(tenor);
	// List.add(pokokbulan);
	// List.add(bungabulan);
	// List.add(cicilan);
	// }
	// return List;
	// }

	public List<String> CicilanBulan(BigDecimal pokok, Integer tenor, double bunga) {
		List<String> result = new ArrayList<>();
		double pokokbulan = pokok.doubleValue() / tenor;
		double bungabulan = pokokbulan * bunga;
		double cicilan = pokokbulan + bungabulan;
		double sisaPinjaman = cicilan * tenor;
		result.add("pokok = " + pokok);
		result.add("tenor = " + tenor);
		result.add("bunga = " + bunga);

		result.add("pokok/bulan = " + pokokbulan);
		result.add("Bunga/bulan = " + bungabulan);
		result.add("Cicilan/bulan = " + cicilan);

		
		result.add("Tenor # Pokok/Bulan # Bunga/Bulan # Cicilan/Bulan # Sisa Pinjaman");
		result.add("  -   #      -     #   -   #    - #   " + sisaPinjaman);
		for (int i = 1; i < tenor; i++) {
			 sisaPinjaman -= cicilan;
			result.add(i + " # " + pokokbulan + " # " + bungabulan + " # " + cicilan + " # " + sisaPinjaman );
		}

		return result;
	}
}
