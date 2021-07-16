package com.revature.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	public static void main(String[] args) {
		
		//here we're just testing whether our connection (from the ConnectionUtil Class) is successful
		//remember - the getConnection() method will return a Connection object if you successfully reach the database
		try(Connection conn = ConnectionUtil.getConnection()) {
			System.out.println("connection successful");
		} catch (SQLException e) {
			e.printStackTrace();
		}
}
	
	
public static Connection getConnection() throws SQLException {
		
		
		try {
			//try to find and return the postgresql Driver Class
			Class.forName("org.postgresql.Driver"); 
		} catch (ClassNotFoundException e) {
			System.out.println("Class wasn't found :(");
			e.printStackTrace(); //prints the exception message to the console
		}
		
		
		String url = "jdbc:postgresql://localhost:5432/postgres?currentSchema=employeeRs";
		String username = "postgres";
		String password = "password"; 
		
		
		return DriverManager.getConnection(url, username, password);
	
}
}
