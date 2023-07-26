package com.java.calculatorapp.ui;

import java.util.Scanner;
import com.java.calculatorapp.businesslayer.Calculation;
import com.java.calculatorapp.utilities.UserInterfaceUtility;
import com.java.calculatorapp.servicelayer.CalculationServiceManager;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char toContinue = 'n';
		Calculation calculation = new Calculation();
		CalculationServiceManager manager = new CalculationServiceManager();

		do {
			UserInterfaceUtility.printMenu();
			char choice = UserInterfaceUtility.getChoice(scanner);
			int first = UserInterfaceUtility.getValue(scanner);
			int second = UserInterfaceUtility.getValue(scanner);
			String result = manager.calculate(choice, first, second, calculation);
			System.out.println("\n" + result);
			toContinue = UserInterfaceUtility.decideToContinue(scanner);
		} while (toContinue == 'y' && toContinue != 'n');
		
		scanner.close();
	}
}
