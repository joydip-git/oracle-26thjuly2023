package com.java.payrollapp.entities;

public class Hr extends Employee {

	private double incentivePayment;

	public Hr() {

	}

	public Hr(String name, int id, double basicPayment, double daPayment, double hraPayment, double incentive) {
		super(name, id, basicPayment, daPayment, hraPayment);
		this.incentivePayment = incentive;
	}

	public double getIncentivePayment() {
		return incentivePayment;
	}

	public void setIncentivePayment(double incentivePayment) {
		this.incentivePayment = incentivePayment;
	}

	public double calculateSalary() {
		return super.calculateSalary() + incentivePayment;
	}

}
