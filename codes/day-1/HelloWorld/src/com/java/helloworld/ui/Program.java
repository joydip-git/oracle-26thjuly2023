package com.java.helloworld.ui;

//import java.io.PrintStream;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		/*PrintStream ps = System.out;
		ps.println("Hello world");*/
		System.out.println("Main method");
		Program.print();
		
		//display();
		Program p = new Program();
		p.display();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter value: ");
		int val = scanner.nextInt();		
		scanner.close();
		System.out.println(val);
	}
	static void print() {
		System.out.println("Hello world");
	}
	
	//non-static or instance method
	void display() {
		System.out.println("display something");
	}
}
