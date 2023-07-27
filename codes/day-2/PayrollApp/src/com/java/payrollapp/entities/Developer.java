package com.java.payrollapp.entities;

public class Developer extends Employee {

	private double gratuityPayment;
	
	public Developer() {
		//super();
	}

	public Developer(String name, int id, double basicPayment, double daPayment, double hraPayment, double gratuity) {
		super(name, id, basicPayment, daPayment, hraPayment);
		setGratuityPayment(gratuity);
	}

	public double getGratuityPayment() {
		return gratuityPayment;
	}

	public void setGratuityPayment(double gratuityPayment) {
		this.gratuityPayment = gratuityPayment;
	}
	public double calculateSalary() {
		return super.calculateSalary() + gratuityPayment;
	}
}
