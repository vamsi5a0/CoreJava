package comdl.testconnections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Eg3 {

	static Connection connection = null;
	static PreparedStatement statement = null;
	
	public static void main(String[] args) throws SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava15_jdbc", "root", "root");
			
			statement = connection.prepareStatement("insert into emp values(?, ?, ?, ?)");
			
			statement.setInt(1, 106);
			statement.setString(2, "Sai Kiran");
			statement.setString(3, "Hyd");
			statement.setDouble(4, 9876543210L);
			statement.addBatch();
			
			statement.setInt(1, 107);
			statement.setString(2, "Sai");
			statement.setString(3, "blore"); 
			statement.setDouble(4, 9876543210L);
			statement.addBatch();
			statement.executeBatch();
			
			System.out.println("Data Inserted");
			
		} catch (ClassNotFoundException e) {

			System.out.println(e);
		}
		finally {
			statement.close();
			connection.close();
			
		}
	}
}