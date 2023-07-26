package com.java.calculatorapp.servicelayer;

import com.java.calculatorapp.businesslayer.Calculation;

public class CalculationServiceManager {
	
	public String calculate(char choice, int first, int second, Calculation calc) {
		String resultString = null;

		switch (choice) {
		case '+':
			int addRes = calc.add(first, second);
			resultString = first + "+" + second + "=" + addRes;
			break;

		case '-':
			int subRes = calc.subtract(first, second);
			resultString = first + "-" + second + "=" + subRes;
			break;

		case '*':
			int multiRes = calc.multiply(first, second);
			resultString = first + "*" + second + "=" + multiRes;
			break;

		case '/':
			int divRes = calc.divide(first, second);
			resultString = first + "/" + second + "=" + divRes;
			break;

		default:
			resultString = "\nenter a proper choice";
			break;
		}
		return resultString;
	}
}
