package com.java.payrollapp.ui;

//import java.util.Arrays;
import java.util.Scanner;

import com.java.payrollapp.entities.*;

public class UserInterface {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int recordCount = getRecordCount(sc);
		// Arrays arr = new Arrays();
		Employee[] employees = new Employee[recordCount];
		addEmployee(employees, sc);
		printSalary(employees);
		sc.close();
	}

	private static int getRecordCount(Scanner sc) {
		System.out.print("Number of employee records: ");
		int count = sc.nextInt();
		return count;
	}

	private static void printMenu() {
		System.out.println("1. developer 2. hr");
	}

	private static int getChoice(Scanner sc) {
		System.out.print("\nEnter choice[1/2]: ");
		int choice = sc.nextInt();
		return choice;
	}

	private static void addEmployee(Employee[] employees, Scanner sc) {
		for (int i = 0; i < employees.length; i++) {
			printMenu();
			int choice = getChoice(sc);
			int id = autogenerateId(employees);
			employees[i] = createEmployee(sc, id, choice);
		}
	}

	private static int autogenerateId(Employee[] employees) {
		Employee employee = null;
		for (int i = 0; i < employees.length; i++) {
			if (employees[i] == null) {
				if (i > 0) {
					employee = employees[i - 1];
					break;
				}
			}
		}
		if (employee != null) {
			int id = employee.getId();
			return ++id;
		} else
			return 100;
	}

	private static Employee createEmployee(Scanner sc, int id, int choice) {
		System.out.print("\nName: ");
		String name = sc.next();
		/*
		 * System.out.print("Id: "); int id = sc.nextInt();
		 */
		System.out.print("Basic: ");
		double basic = sc.nextDouble();
		System.out.print("Da: ");
		double da = sc.nextDouble();
		System.out.print("Hra: ");
		double hra = sc.nextDouble();
		/* Employee employee = new Employee(name, id, basic, da, hra); */
		Employee employee = null;
		switch (choice) {
		case 1:
			System.out.print("Gratuity: ");
			double gratuity = sc.nextDouble();
			employee = new Developer(name, id, basic, da, hra, gratuity);
			break;

		case 2:
			System.out.print("Incentive: ");
			double incentive = sc.nextDouble();
			employee = new Hr(name, id, basic, da, hra, incentive);
			break;

		default:
			break;
		}
		return employee;
	}

	private static void printSalary(Employee[] employees) {
		for (Employee employee : employees) {
			double salary = employee.calculateSalary(); 
			System.out.println(
					"\nSalary of " + employee.getName() + " with id " + employee.getId() + " is " + salary);
			/*if (employee instanceof Developer) {
			Developer developer = (Developer) employee;
			double salary = developer.calculateSalary();
			System.out.println(
					"\nSalary of " + employee.getName() + " with id " + employee.getId() + " is " + salary);
		}
		if (employee instanceof Hr) {
			Hr hr = (Hr) employee;
			double salary = hr.calculateSalary();
			System.out.println(
					"\nSalary of " + employee.getName() + " with id " + employee.getId() + " is " + salary);
		}*/
			
		}
	}

}
