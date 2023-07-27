package com.java.classinjava.entities;

public class Car {
	// private attributes
	String chasisNumber;
	private String bodyColor;
	private int noOfGears;
	private String modeOfTransmission;
	private int seatingCapacity;
	private int makeYear;
	private String companyName;
	private String modelName;

	// constructor: default
	public Car() {
		// bodyColor = null;
		// noOfGears=0;
	}

	// constructor: parameterized
	public Car(String chasis, String color, String model, String company, String transmission, int capacity, int gears,
			int year) {

		bodyColor = color;
		chasisNumber = chasis;
		modelName = model;
		companyName = company;
		modeOfTransmission = transmission;
		seatingCapacity = capacity;
		noOfGears = gears;
		makeYear = year;
	}

	// public methods
	public String getInfo() {
		return modelName + ", " + bodyColor + ", " + seatingCapacity + ", " + noOfGears;
	}

	public String start() {
		return "Car started";
	}

	public String stop() {
		return "Car started";
	}

	public void applyBreak() {
	}

	public void acclerate() {
	}
}
