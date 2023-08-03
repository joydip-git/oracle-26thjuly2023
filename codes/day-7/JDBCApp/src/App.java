import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {

	static void registerDriver() throws ClassNotFoundException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException ex) {
			throw ex;
		} catch (Exception ex) {
			throw ex;
		}
	}

	static Connection createConnection() throws SQLException {
		try {
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system",
					"Orcl2022");
			return connection;
		} catch (SQLException e) {
			throw e;
		} catch (Exception ex) {
			throw ex;
		}
	}

	static void closeConnection(Connection connection) throws SQLException {
		if (connection != null)
			connection.close();
	}

	public static void main(String[] args) {
		Connection connectionInstance = null;
		Statement statement = null;
		PreparedStatement preparedStatement = null;
		ResultSet queryResult = null;

		try {
			// 1. register the driver
			registerDriver();

			// 2. create connection
			connectionInstance = createConnection();

			// 3. create a statement with SQL query
			//statement = connectionInstance.createStatement();
			preparedStatement = connectionInstance.prepareStatement("select product_id,product_name,price,description,category_id from products where product_id=?");
			preparedStatement.setInt(1, 3);
			
			// 4. execute the query
			//queryResult = statement.executeQuery("select employee_id, employee_name from employees");
			queryResult = preparedStatement.executeQuery();
			while (queryResult.next()) {
				System.out.println(queryResult.getInt(1) + ", " + queryResult.getString(2));
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// 5. close the connection
				closeConnection(connectionInstance);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
