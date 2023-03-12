package com.demo.dao;

// Data Transfer Object (DTO)
public class Employee {

	// Attributes
	private int id;
	private int empId;
	private String firstName;
	private String lastName;
	private int deptId;
	
	// Constructor
	public Employee(int id, int empId, String firstName, String lastName, int deptId) {
		this.id = id;
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.deptId = deptId;
	}

	// Getters and setters
	public int getId() {
		return id;
	}

	public int getEmpId() {
		return empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	// toString() method
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", deptId=" + deptId + "]";
	}
	
	
}
