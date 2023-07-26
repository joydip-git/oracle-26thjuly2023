package com.java.calculatorapp.ui;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		printMenu();
		char choice = getChoice(scanner);
		int first = getValue(scanner);
		int second = getValue(scanner);
		String result = calculate(choice, first, second);
		System.out.println("\n" + result);

		scanner.close();
	}

	static void printMenu() {
		System.out.println("1. Add (+)\n2. Subtract(-)\n3. Multiply(*)\n4. Divide(/) ");
	}

	static char getChoice(Scanner sc) {
		System.out.print("Enter choice[+,-,*./]: ");
		char ch = sc.next().charAt(0);
		return ch;
	}

	static int getValue(Scanner sc) {
		System.out.print("\nEnter value: ");
		return sc.nextInt();
	}

	static String calculate(char choice, int first, int second) {
		String resultString = null;

		switch (choice) {
		case '+':
			int addRes = add(first, second);
			resultString = first + "+" + second + "=" + addRes;
			break;

		case '-':
			int subRes = subtract(first, second);
			resultString = first + "-" + second + "=" + subRes;
			break;

		case '*':
			int multiRes = multiply(first, second);
			resultString = first + "*" + second + "=" + multiRes;
			break;

		case '/':
			int divRes = divide(first, second);
			resultString = first + "/" + second + "=" + divRes;
			break;

		default:
			resultString = "\nenter a proper choice";
			break;
		}
		return resultString;
	}

	static int add(int firstValue, int secondValue) {
		return firstValue + secondValue;
	}

	static int subtract(int firstValue, int secondValue) {
		return firstValue - secondValue;
	}

	static int multiply(int firstValue, int secondValue) {
		return firstValue * secondValue;
	}

	static int divide(int firstValue, int secondValue) {
		return firstValue / secondValue;
	}
}
