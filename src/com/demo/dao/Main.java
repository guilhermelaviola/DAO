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
		//EmployeeDAO employeeDAO = new EmployeeDAOImpl();
		
		//Employee employee = new Employee(4, 14576, "Andrew", "Jones", 8);
		
		//int result = employeeDAO.insert(employee);
		
		//System.out.println(result);
		
		// Test 5: Testing if update() works
		//EmployeeDAO employeeDAO = new EmployeeDAOImpl();
		
		//Employee employee = new Employee(5, 23434, "Joshua", "Nelson", 3);
		
		//employeeDAO.update(employee);
		
		// Test 6: Testing if delete() works
		EmployeeDAO employeeDAO = new EmployeeDAOImpl();
		
		Employee employee = employeeDAO.get(6);
		
		// Displaying the employee before deleting it
		System.out.println(employee);
		
		int result = employeeDAO.delete(employee);
		
		System.out.println(result);
		
	}
}
