package com.java.classinjava.ui;

import com.java.classinjava.entities.Car;

public class Program {

	public static void main(String[] args) {
		int a = 100;
		System.out.println(a);
		// create is a reference variable (present in stack), which stores reference of
		// an Car instance (present in the heap)
		// Car creta = null;
		// creta = new Car(null, "grey", "Creta", "Hyundai", "automatic", 5, 6, 2022);
		Car creta = new Car("axhp124445", "grey", "Creta", "Hyundai", "automatic", 5, 6, 2022);
		// Car creta = new Car();
		/* creta.setChasisNumber(chasisNumber); */
		// creta.setChasisNumber("axhp124445");

		System.out.println(creta.getChasisNumber());
		System.out.println(creta.getInfo());
	}

}
