package com.springcrud.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springcrud.beans.Employee;

public class EmployeeMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum)throws SQLException{
		Employee employee =new Employee();
		employee.setPid(rs.getInt("pid"));
		employee.setName(rs.getString("name"));
		employee.setQty(rs.getString("qty"));
		employee.setPrice(rs.getFloat("price"));
		return employee;
	}

	
	

}

