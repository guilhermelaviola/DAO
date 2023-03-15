package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// Database connection with JDBC
public class DBConnection {

	// Variables that define the database url, user and password
	private static String url = "jdbc:mariadb://localhost:3306/tutorial";
	private static String user = "root";
	private static String password = "root";
	
	// Empty constructor
	private DBConnection() {
		
	}
	
	// Other methods
	// Establishing a database connection
	public static Connection getConnection() throws SQLException{
		Connection connection = null;
		connection = DriverManager.getConnection(url, user, password);
		
		return connection;
	}
	
	// Closing the database connection
	public static void closeConnection(Connection connection) throws SQLException {
		connection.close();
	}
	
	// Closing the statement
	public static void closeStatement(Statement statement) throws SQLException {
		statement.close();
	}
	
	// Closing the prepared statement
	public static void closePreparedStatement(PreparedStatement preparedStatement) throws SQLException {
		preparedStatement.close();
	}
	
	// Closing the result set
	public static void closeResultSet(ResultSet resultSet) throws SQLException {
		resultSet.close();
	}
}
