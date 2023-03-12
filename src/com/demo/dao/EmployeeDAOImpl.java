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

	@Override
	public int insert(Employee employee) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Employee employee) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
