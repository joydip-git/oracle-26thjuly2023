package com.java.pmsapp.dataaccess.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataAccessUtility {
	public static void regsiterDriver() throws ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
	}

	public static Connection createConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Orcl2022");
	}

	public static Statement createJDBCStatement(Connection connection) throws SQLException {
		return connection.createStatement();
	}
	/*public static Statement createStatement(Connection connection, String query) throws SQLException {
		return connection.createStatement();
	}*/

	public static void closeConnection(Connection connection) throws SQLException{
		if(connection!=null)
			connection.close();
	}
}
