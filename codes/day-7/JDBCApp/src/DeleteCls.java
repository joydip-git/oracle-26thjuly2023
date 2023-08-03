import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteCls {

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
					"delete from products where product_id=?");
			preparedStatement.setInt(1, 7);
			

			// 4. execute the query
			result = preparedStatement.executeUpdate();
			if(result>0) {
				System.out.println("record deleted successfully");
			}else {
				System.out.println("record could not be deleted");
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
