package com.bala.codetest;

import com.bala.codetest.di.annotation.DepInject;

public class ConstructorInjectionExample {

	private final CalculatorService calculatorService;

	@DepInject
	public ConstructorInjectionExample(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;
	}

	public int processNumbers(int firstNumber, int secondNumber) {
		int number = calculatorService.calculate(firstNumber, secondNumber);
		return number;
	}
}