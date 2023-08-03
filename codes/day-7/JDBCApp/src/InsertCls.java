import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertCls {

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
		PreparedStatement preparedStatement = null;
		Integer result = null;

		try {
			// 1. register the driver
			registerDriver();

			// 2. create connection
			connectionInstance = createConnection();

			// 3. create a statement with SQL query
			preparedStatement = connectionInstance.prepareStatement(
					"insert into products(product_id,product_name,price,description,category_id) values(?,?,?,?,?)");
			preparedStatement.setInt(1, 7);
			preparedStatement.setString(2, "redmi 7");
			preparedStatement.setString(4, "new mobile from redmi");
			preparedStatement.setFloat(3, 70000);
			preparedStatement.setInt(5, 2);

			// 4. execute the query
			result = preparedStatement.executeUpdate();
			if(result>0) {
				System.out.println("record inserted successfully");
			}else {
				System.out.println("record icould not be added");
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
