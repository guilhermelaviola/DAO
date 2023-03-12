package com.demo.dao;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException {
		// Employee employee = new Employee(123, 1234, "Aaron", "Douglas", 21);
		
		// System.out.println(employee);
		
		// Testing the DB connection
		//Connection conn = DBConnection.getConnection();
		
		//if(conn != null) {
			//System.out.println("Database connection successful!");
		//}
		
		// Testing if get() works
		EmployeeDAO employeeDAO = new EmployeeDAOImpl();
		
		Employee employee = employeeDAO.get(11);
		
		System.out.println(employee);
	}
}
