package com.demo.dao;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException {
		// Test 1
		// Employee employee = new Employee(123, 1234, "Aaron", "Douglas", 21);
		
		// System.out.println(employee);
		
		// Test 2: Testing the DB connection
		//Connection conn = DBConnection.getConnection();
		
		//if(conn != null) {
			//System.out.println("Database connection successful!");
		//}
		
		// Test 3: Testing if get() works
		//EmployeeDAO employeeDAO = new EmployeeDAOImpl();
		
		//Employee employee = employeeDAO.get(11);
		
		//System.out.println(employee);
		
		// Test 4: Testing if insert() works
		EmployeeDAO employeeDAO = new EmployeeDAOImpl();
		
		Employee employee = new Employee(0, 14576, "Andrew", "Jones", 8);
		
		int result = employeeDAO.insert(employee);
		
		System.out.println(result);
	}
}
