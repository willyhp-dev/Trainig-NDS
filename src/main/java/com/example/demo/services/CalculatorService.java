package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.models.CaculatorModel;

@Service
public class CalculatorService {
	public Integer multiply(CaculatorModel calculatorModel) {
		Integer result = calculatorModel.getFirstInput() * calculatorModel.getSecondInput();
		return result;
	}

	public Integer add(Integer input1, Integer input2) {
		return input1 + input2;
	}
}
