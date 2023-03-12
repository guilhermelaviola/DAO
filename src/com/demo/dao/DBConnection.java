package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Database connection with JDBC
public class DBConnection {

	private static String url = "jdbc:mariadb://localhost:3306/tutorial";
	private static String user = "root";
	private static String password = "root";
	
	// Empty constructor
	private DBConnection() {
		
	}
	
	public static Connection getConnection() throws SQLException{
		Connection connection = null;
		connection = DriverManager.getConnection(url, user, password);
		
		return connection;
	}
}
