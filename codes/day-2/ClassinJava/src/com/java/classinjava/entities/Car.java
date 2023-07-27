package com.java.classinjava.entities;

public class Car {
	// private attributes
	private String chasisNumber;
	private String bodyColor;
	private String companyName;
	private String modelName;
	private String modeOfTransmission;

	private int noOfGears;
	private int seatingCapacity;
	private int makeYear;

	// constructor: default
	public Car() {
	}

	// constructor: parameterized constructor
	public Car(String chasisNumber, String bodyColor, String companyName, String modelName, String modeOfTransmission,
			int noOfGears, int seatingCapacity, int makeYear) {
		super();
		this.chasisNumber = chasisNumber;
		this.bodyColor = bodyColor;
		this.companyName = companyName;
		this.modelName = modelName;
		this.modeOfTransmission = modeOfTransmission;
		this.noOfGears = noOfGears;
		this.seatingCapacity = seatingCapacity;
		this.makeYear = makeYear;
	}

	//getters and setters
	
	public String getChasisNumber() {
		return chasisNumber;
	}

	public void setChasisNumber(String chasisNumber) {
		this.chasisNumber = chasisNumber;
	}

	public String getBodyColor() {
		return bodyColor;
	}

	public void setBodyColor(String bodyColor) {
		this.bodyColor = bodyColor;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getModeOfTransmission() {
		return modeOfTransmission;
	}

	public void setModeOfTransmission(String modeOfTransmission) {
		this.modeOfTransmission = modeOfTransmission;
	}

	public int getNoOfGears() {
		return noOfGears;
	}

	public void setNoOfGears(int noOfGears) {
		this.noOfGears = noOfGears;
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public int getMakeYear() {
		return makeYear;
	}

	public void setMakeYear(int makeYear) {
		this.makeYear = makeYear;
	}

	// methods
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
