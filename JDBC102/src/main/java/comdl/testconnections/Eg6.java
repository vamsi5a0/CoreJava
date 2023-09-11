package comdl.testconnections;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Eg6 {
	static Connection connection = null;

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/advjava15_jdbc?autoReconnect=true&useSSL=false", "root", "root");
			DatabaseMetaData metaData = connection.getMetaData();
			System.out.println(metaData.getDriverName());
			System.out.println(metaData.getDriverVersion());
			System.out.println(metaData.getUserName());
			System.out.println(metaData.getDatabaseProductName());
			System.out.println(metaData.getDatabaseProductVersion());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
