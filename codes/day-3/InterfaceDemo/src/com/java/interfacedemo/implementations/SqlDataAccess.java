package com.java.interfacedemo.implementations;

import com.java.interfacedemo.abstracts.DataAccess;
import com.java.interfacedemo.contracts.IDataSaver;

public final class SqlDataAccess extends DataAccess implements IDataSaver {

	public SqlDataAccess() {
		
	}

	public SqlDataAccess(String databaseConnectionString) {
		super(databaseConnectionString);		
	}

	@Override
	public String getData() {		
		return "data from sql server";
	}

	@Override
	public void saveData() {
		System.out.println("saved sql server data");
	}

}
