package com.bala.codetest;


public class AddService implements CalculatorService {

	@Override
	public int calculate(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber;
	}

}
