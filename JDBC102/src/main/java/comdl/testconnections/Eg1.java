package comdl.testconnections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Eg1 {
	static Connection connection = null;
	static Statement statement = null;

	public static void main(String[] args) throws SQLException {
		try {
			// Step-1 load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Step-2 get connection
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava15_jdbc", "root", "root");

			// step3 Create statement Object
			statement = connection.createStatement();

			// step4- executing query
			//String create = "create table emp(e_id int,e_name varchar(40),e_address varchar(255),e_salary double)";
			 String insert="insert into emp values(101,'sai','hyd',987654)";
			statement.executeUpdate(insert);

			//System.out.println("Table created");
			 System.out.println("data created");
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} finally {
			
			// step5 closing connections
			statement.close();
			connection.close();
		}

	}
}
 