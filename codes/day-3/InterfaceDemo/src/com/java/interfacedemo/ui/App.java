package com.java.interfacedemo.ui;

import com.java.interfacedemo.abstracts.*;
import com.java.interfacedemo.contracts.*;
import com.java.interfacedemo.implementations.*;

public class App {

	public static void main(String[] args) {
		IDataAccess dataAccess = null;
		switch (3) {
		case 1:
			dataAccess = new OracleDataAccess("");
			break;
		case 2:
			dataAccess = new SqlDataAccess("");
			break;
		case 3:
			dataAccess = new TextFileDataAccess("");
			break;

		default:
			break;
		}

		if (dataAccess != null) {
			DataAccess da = (DataAccess) dataAccess;
			da.openDbConnection();
			System.out.println(da.getData());
			da.closeDbConnection();
		}
	}
}
