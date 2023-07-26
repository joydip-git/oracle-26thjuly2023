package com.java.calculatorapp.utilities;

import java.util.Scanner;

public class UserInterfaceUtility {
	// UI logic (console)
	public static void printMenu() {
		System.out.println("1. Add (+)\n2. Subtract(-)\n3. Multiply(*)\n4. Divide(/) ");
	}

	public static char getChoice(Scanner sc) {
		System.out.print("Enter choice[+,-,*./]: ");
		char ch = sc.next().charAt(0);
		return ch;
	}

	public static int getValue(Scanner sc) {
		System.out.print("\nEnter value: ");
		return sc.nextInt();
	}
	
	public static char decideToContinue(Scanner sc) {
		System.out.print("\nWould you like to continue?[y/Y/n/N]: ");
		char ch = sc.next().charAt(0);
		if (Character.isUpperCase(ch)) {
			ch = Character.toLowerCase(ch);
		}
		return ch;
	}
}
