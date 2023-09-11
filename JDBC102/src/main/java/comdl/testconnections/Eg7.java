package comdl.testconnections;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class Eg7 {

	static Connection connection = null;
	static CallableStatement callableStatement = null;
	static Scanner scanner = null;
	
	public static void main(String[] args) throws SQLException {
		
		String SQL = "CALL getEmployeeById(?)";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava15_jdbc?autoReconnect=true&useSSL=false", "root", "root");

			callableStatement = connection.prepareCall(SQL);
			
			scanner = new Scanner(System.in); 
			System.out.println("Enter Employee ID::");
			int empId = scanner.nextInt();
			callableStatement.setInt(1, empId);
			
			ResultSet rs = callableStatement.executeQuery();
			while (rs.next()) {
				int empId2 = rs.getInt("emp_id");
				String eName = rs.getString("ename");
				String email = rs.getString("email");
				Double salary = rs.getDouble("salary");
				BigDecimal bonus = rs.getBigDecimal("bonus");

				System.out.println(empId2 + " " + eName + " " + salary + " " + email + " " + bonus);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			scanner.close();
			callableStatement.close();
			connection.close();
		}
	}
}