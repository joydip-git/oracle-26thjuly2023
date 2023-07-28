package com.java.abstractdemo.ui;

import java.util.Scanner;

import com.java.abstractdemo.entities.*;

public class DataAccessUserInterface {

	public static void main(String[] args) {
		System.out.println("enter choice[1/2/3]: ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		sc.close();
		DataAccess dataAccess = null;
		switch (choice) {
		case 1:
			dataAccess = new OracleDataAccess("");
			break;

		case 2:
			dataAccess = new MongoDbDataAccess("");
			break;

		case 3:
			dataAccess = new XmlFileDataAccess("");
			break;

		default:
			break;
		}

		if (dataAccess != null) {
			System.out.println(dataAccess.getData());
		}	

	}

}
