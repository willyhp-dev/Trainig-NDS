package com.example.demo.Controllers;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.LoanModel;
import com.example.demo.services.LoanServices;

@RestController
public class LoanController {
	@Autowired
	LoanServices loanServices;

	@PostMapping(value="/loan")
	public ResponseEntity<List<String>> postAdding(@RequestParam BigDecimal pokok,
			@RequestParam Integer tenor, @RequestParam Double bunga) {
		return ResponseEntity.ok(loanServices.CicilanBulan(pokok, tenor, bunga));
	}

}
