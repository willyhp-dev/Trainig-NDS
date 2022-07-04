package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.CaculatorModel;
import com.example.demo.services.CalculatorService;

@RestController
@RequestMapping(value = "/calculator")
public class CalculatorController {
	@Autowired
	CalculatorService calculatorService;

	@PostMapping(value = "/multiply")
	public ResponseEntity<Integer> postMultiply(@RequestBody CaculatorModel calculatorModel) {
		Integer response = calculatorService.multiply(calculatorModel);
		return ResponseEntity.ok(response);
	}

	@PostMapping(value = "/adding")
	public ResponseEntity<Integer> postAdding(@RequestParam Integer firstInput,
			@RequestParam Integer secondInput) {
		return ResponseEntity.ok(calculatorService.add(firstInput, secondInput));
	}
}
