package com.bala.codetest;

import com.bala.codetest.di.annotation.DepInject;

public class FieldInjectionExample {

	@DepInject
	private CalculatorService calculatorService;



	public int processNumbers(int firstNumber, int secondNumber) {
		int number = calculatorService.calculate(firstNumber, secondNumber);
		return number;
	}
}