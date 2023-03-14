package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

// Class to be instantiated when we want to
// persist information to our Relational Database
public class EmployeeDAOImpl implements EmployeeDAO {

	// CRUD: Retrieving employee
	@Override
	public Employee get(int id) throws SQLException {
		Connection conn = DBConnection.getConnection();
		Employee employee = null;
		
		String sql = "SELECT id, employee_id, first_name, last_name, dept_id FROM employees WHERE id = ?";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setInt(1, id);
		
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {
			int objectId = rs.getInt("id");
			int employeeId = rs.getInt("employeeId");
			String firstName = rs.getString("first_name");
			String lastName = rs.getString("last_name");
			int deptId = rs.getInt("dept_id");
			
			employee = new Employee(objectId, employeeId, firstName, lastName, deptId);
		}
		return employee;
	}

	@Override
	public List<Employee> getAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Employee employee) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	// CRUD: Inserting employee
	@Override
	public int insert(Employee employee) throws SQLException {
		Connection conn =  DBConnection.getConnection();
		
		String sql = "INSERT INTO employees (employee_id, first_name, last_name, dept_id) VALUES(?, ?, ?, ?)";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setInt(1, employee.getEmpId());
		ps.setString(2, employee.getFirstName());
		ps.setString(3, employee.getLastName());
		ps.setInt(4, employee.getDeptId());
		
		int result = ps.executeUpdate();
		
		ps.close();
		conn.close();
		
		return result;
	}

	// CRUD: Updating employee
	@Override
	public int update(Employee employee) throws SQLException {
		Connection conn = DBConnection.getConnection();
		
		String sql = "UPDATE employees SET employee_id = ?, first_name = ?, last_name = ?, dept_id = ? WHERE id = ?";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setInt(1, employee.getEmpId());
		ps.setString(2, employee.getFirstName());
		ps.setString(3, employee.getLastName());
		ps.setInt(4, employee.getDeptId());
		ps.setInt(5, employee.getId());
		
		int result = ps.executeUpdate();
		
		ps.close();
		conn.close();
		
		return result;
	}

	// CRUD: Deleting employee
	@Override
	public int delete(Employee employee) throws SQLException {
		Connection conn = DBConnection.getConnection();
		
		String sql = "DELETE FROM employees WHERE id = ?";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setInt(1, employee.getId());
		
		int result = ps.executeUpdate();
		
		ps.close();
		conn.close();
		
		return result;
	}

}
