package com.java.calculation.implementation;

public class Calculation {
	public int add(int first, int second) {
		return first + second;
	}

	public int multiply(int first, int second) throws ArithmeticException{
		if (first >= 0 && second >= 0)
			return first * second;
		else
			throw new ArithmeticException("values can't be less than zero");
			//throw new Exception("values can't be less than zero");

	}

	public int divide(int first, int second) {
		return first / second;
	}
}
