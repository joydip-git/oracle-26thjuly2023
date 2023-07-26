package com.java.helloworld.ui;

//import java.io.PrintStream;

public class Program {
	public static void main(String[] args) {
		/*PrintStream ps = System.out;
		ps.println("Hello world");*/
		System.out.println("Main method");
		Program.print();
		
		//display();
		Program p = new Program();
		p.display();
	}
	static void print() {
		System.out.println("Hello world");
	}
	
	//non-static or instance method
	void display() {
		System.out.println("display something");
	}
}
