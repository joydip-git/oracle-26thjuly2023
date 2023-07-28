package com.java.interfacedemo.abstracts;

import com.java.interfacedemo.contracts.IDataAccess;

public abstract class DataAccess implements IDataAccess {
	String databaseConnectionString;

	public DataAccess() {
	}

	public DataAccess(String databaseConnectionString) {
		this.databaseConnectionString = databaseConnectionString;
	}

	public String getDatabaseConnectionString() {
		return databaseConnectionString;
	}

	public void setDatabaseConnectionString(String databaseConnectionString) {
		this.databaseConnectionString = databaseConnectionString;
	}

	public void openDbConnection() {
		System.out.println("connection opened");
	}

	public void closeDbConnection() {
		System.out.println("connection closed");
	}
}
