package com.java.arraydemo.ui;

import java.util.Scanner;;

public class Program {

	public static void main(String[] args) {
		// Array numbers = new Array(4);
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[4];

		for (int i = 0; i < numbers.length; i++) {
			System.out.print("enter value at numbers[" + i + "]: ");
			numbers[i] = sc.nextInt();
		}
		System.out.println("\nvalues from the numbers array\n");
		
		//for-each: iterate through the collection and pick up every value
		//and store in the local variable (one at a time)
		//this is a read-only loop
		for (int num : numbers) {
			System.out.println(num);
		}
		
		int[][] twoDimNumbers = new int[3][2];
		for (int i = 0; i < 3; i++) {			
			for (int j = 0; j < 2; j++) {				
				System.out.print("enter value at numbers[" + i + "]["+j+"]: ");
				twoDimNumbers[i][j] = sc.nextInt();
			}
		}
		System.out.println("\nvalues from the two dimensional numbers array\n");
		for (int i = 0; i < 3; i++) {			
			for (int j = 0; j < 2; j++) {				
				System.out.print(twoDimNumbers[i][j] +"\t");
			}
			System.out.println("\n");
		}
		sc.close();
	}
}
