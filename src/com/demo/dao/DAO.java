package com.demo.dao;

import java.sql.SQLException;
import java.util.List;

// Generic interface
public interface DAO<T> {

	// Defining the standard operations to be performed 
	// on model objects
	T get(int id) throws SQLException;
	
	List<T> getAll() throws SQLException;
	
	int save(T e) throws SQLException;
	
	int insert(T e) throws SQLException;
	
	int update (T e) throws SQLException;
	
	int delete(T e);
}
