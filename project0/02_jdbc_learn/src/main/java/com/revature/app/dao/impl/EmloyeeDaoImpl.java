package com.revature.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.app.dao.Employeedao;
import com.revature.app.dao.Util;
import com.revature.model.Department;
import com.revature.model.Employee;

public class EmloyeeDaoImpl implements Employeedao {

	@Override
	public List<Employee> list() throws SQLException {
		// TODO Auto-generated method stub
		List<Employee> employeeList =new ArrayList();
	try	(Connection connection=Util.getconnection()){
		String sql="select * from employee e\r\n" + 
				"inner join department d\r\n" + 
				"on e.department_id=d.id; ";
		PreparedStatement statement=connection.prepareStatement(sql);
	
	ResultSet resultSet=	statement.executeQuery();
	
	while(resultSet.next()) {
		Employee employee =new Employee();
		employee.setId(resultSet.getInt("id"));
		employee.setName(resultSet.getString("name"));
		employee.setSalary(resultSet.getDouble("salary"));
		employee.setGender(resultSet.getString("gender").charAt(0));
		Department department =new Department();
		department.setId(resultSet.getInt("d.id"));
		department.setName(resultSet.getString("d.name"));
		//employee.setDepartmentId(resultSet.getInt("department_id"));
		employee.setDepartment(department);
		employeeList.add(employee);
		
		
	}
	employeeList.forEach(System.out::println);
	
		
	}
		return employeeList;
	}

	@Override
	public Employee get(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(Employee employee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Employee employee) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	

}
