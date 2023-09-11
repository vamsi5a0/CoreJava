package comdl.testconnections;

import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDriver {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver connected");
		} catch (Exception e) {
		System.out.println("driver not found");
		}
//		DriverManager.registerDriver("com.mysql.cj.jdbc.Driver");
//		System.out.println("Driver Connected");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava15_jdbc","root","root");
			System.out.println("database connected");
		} catch (ClassNotFoundException e) {
		System.out.println("database not found");
		}
		
	}

}
