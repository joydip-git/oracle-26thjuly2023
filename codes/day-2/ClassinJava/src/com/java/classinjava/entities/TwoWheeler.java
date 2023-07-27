package com.java.classinjava.entities;

public class TwoWheeler extends LightMotorVehicle {
	
	public TwoWheeler() {

	}

	public TwoWheeler(String chasisNumber, String bodyColor, String companyName, String modelName, int noOfGears,
			int makeYear) {
		
		/*this.chasisNumber = chasisNumber;
		this.bodyColor = bodyColor;
		this.companyName = companyName;
		this.modelName = modelName;
		this.noOfGears = noOfGears;
		this.makeYear = makeYear;*/
		super(chasisNumber, bodyColor, companyName, modelName, noOfGears, makeYear);
	}
}
