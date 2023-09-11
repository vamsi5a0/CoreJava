package comdl.testconnections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Eg5 {
	static Connection connection = null;

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava15_jdbc?autoReconnect=true&useSSL=false", "root", "root");

			Statement createStatement = connection.createStatement();

			String s1 = "select * from emp";

			ResultSet resultSet = createStatement.executeQuery(s1);
			
			ResultSetMetaData metaData = resultSet.getMetaData();
			
			int columnCount = metaData.getColumnCount();
			
			for (int i = 1; i <= columnCount; i++) {
				System.out.println("size" + metaData.getColumnDisplaySize(columnCount));
				System.out.println("column name" + metaData.getColumnName(i));
				System.out.println("column type" + metaData.getColumnTypeName(i));
				System.out.println();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
