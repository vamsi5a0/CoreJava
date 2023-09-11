package com.dl.testconnections;

import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDriver {

	public static void main(String[] args) throws SQLException {
	
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			
//			System.out.println("Driver Connected");
//			
//		} catch (ClassNotFoundException e) {
//			System.out.println("Driver Not Found");
//		}
		
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		System.out.println("Driver Connected");

	}

}