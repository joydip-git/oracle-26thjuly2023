package com.java.classinjava.entities;

public class Car extends LightMotorVehicle {

	private String modeOfTransmission;
	private int seatingCapacity;

	// constructor: default
	public Car() {
		super();
		//super(null, null, null, null, 0, 0);
		System.out.println("Car default ctor");
	}

	// constructor: parameterized constructor
	public Car(String chasisNumber, String bodyColor, String companyName, String modelName, String modeOfTransmission,
			int noOfGears, int seatingCapacity, int makeYear) {
		/*
		 * this.chasisNumber = chasisNumber; this.bodyColor = bodyColor;
		 * this.companyName = companyName; this.modelName = modelName; this.makeYear =
		 * makeYear; this.noOfGears = noOfGears;
		 */
		super(chasisNumber, bodyColor, companyName, modelName, noOfGears, makeYear);
		
		this.seatingCapacity = seatingCapacity;
		this.modeOfTransmission = modeOfTransmission;
		
		System.out.println("Car parameterized ctor");
	}

	// getters and setters
	public String getModeOfTransmission() {
		return modeOfTransmission;
	}

	public void setModeOfTransmission(String modeOfTransmission) {
		this.modeOfTransmission = modeOfTransmission;
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}
}
