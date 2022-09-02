package com.springcrud.dao;


import java.util.List;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.springcrud.beans.Employee;

public class EmployeeDao {
	JdbcTemplate template;
	public void setTemplate(JdbcTemplate template){
		this.template=template;
	}
	public int insert(Employee emp){
		String sql="insert into product(pid,name,qty,price)values(?,?,?,?)";
		int ans=template.update(sql,emp.getPid(),emp.getName(),emp.getQty(),emp.getPrice());
		return ans;
	}

	public int update(Employee emp){
		String sql="update product set name=?, qty=?, price=? where pid=?";
		int ans=template.update(sql,emp.getName(),emp.getQty(),emp.getPrice(),emp.getPid());
		return ans;
	}
	public int delete(int id){
		String sql="delete from product where pid=?";
		return template.update(sql,id);
	}
	public Employee getEmpId(int id){
		String sql="select * from product where pid=?";
		@SuppressWarnings("deprecation")
		Employee emp=template.queryForObject(sql,new Object[]{id}, new EmployeeMapper());
		
		return emp;
	}
	
	public List<Employee> getEmployeesDetails(){
		String sql="select * from product";
		List<Employee>empList=template.query(sql, new EmployeeMapper());
		return empList;
	}
	
	
	
}
