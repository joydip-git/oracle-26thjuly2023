package com.java.classinjava.entities;

public class LightMotorVehicle {
	
	protected String chasisNumber;
	protected String bodyColor;
	protected String companyName;
	protected String modelName;
	protected int noOfGears;
	protected int makeYear;

	public LightMotorVehicle() {
		System.out.println("LMV default ctor");
	}

	public LightMotorVehicle(String chasisNumber, String bodyColor, String companyName, String modelName, int noOfGears,
			int makeYear) {
		
		System.out.println("LMV parameterized ctor");
		this.chasisNumber = chasisNumber;
		this.bodyColor = bodyColor;
		this.companyName = companyName;
		this.modelName = modelName;
		this.noOfGears = noOfGears;
		this.makeYear = makeYear;
	}

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

	public int getNoOfGears() {
		return noOfGears;
	}

	public void setNoOfGears(int noOfGears) {
		this.noOfGears = noOfGears;
	}

	public int getMakeYear() {
		return makeYear;
	}

	public void setMakeYear(int makeYear) {
		this.makeYear = makeYear;
	}

	// methods
	public String getInfo() {
		return modelName + ", " + bodyColor + ", " + noOfGears;
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
