package com.bala.codetest;


public class SubService implements CalculatorService {

	@Override
	public int calculate(int firstNumber, int secondNumber) {
		return firstNumber - secondNumber;
	}

}
