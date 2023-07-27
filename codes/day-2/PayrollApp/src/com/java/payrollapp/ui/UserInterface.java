package com.java.payrollapp.ui;

import java.util.Arrays;
import java.util.Scanner;
import com.java.payrollapp.entities.Employee;

public class UserInterface {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int recordCount = getRecordCount(sc);
		//Arrays arr = new Arrays();
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

	private static void addEmployee(Employee[] employees, Scanner sc) {
		for (int i = 0; i < employees.length; i++) {
			int id = autogenerateId(employees);
			Employee employee = createEmployee(sc,id);
			employees[i] = employee;
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

	private static Employee createEmployee(Scanner sc, int id) {
		System.out.print("\nName: ");
		String name = sc.next();
		/*System.out.print("Id: ");
		int id = sc.nextInt();*/
		System.out.print("Basic: ");
		double basic = sc.nextDouble();
		System.out.print("Da: ");
		double da = sc.nextDouble();
		System.out.print("Hra: ");
		double hra = sc.nextDouble();
		Employee employee = new Employee(name, id, basic, da, hra);
		return employee;
	}

	private static void printSalary(Employee[] employees) {
		for (Employee employee : employees) {
			double salary = employee.calculateSalary();
			System.out.println("\nSalary of " + employee.getName() + " with id "+employee.getId()+" is " + salary);
		}
	}

}
