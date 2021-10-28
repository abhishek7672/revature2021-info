package com.revature.form;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.customer.dao.Impl.EmployeeDaoImp;
import com.revature.menu.EmployeeMenu;
import com.revature.model.Employee;

public class EmployeeReg extends Form{
	private String email;
	private String password;


	public EmployeeReg(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void capturedata() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Employee email");
		email = sc.nextLine();
		System.out.println("Enter Password");
		password = sc.nextLine();

		
		
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		EmployeeDaoImp edao = new EmployeeDaoImp();
		try {
			Employee employee = edao.getEmployeeEmail(email);
			if(employee == null) {
				System.out.println("Invalid User or Password");
			}
			else if(employee.getPassword().equals(password)) {
				sucess = true;
				System.out.println("Login Sucessfully\n");
				System.out.println("Welcome as admin" +employee. getEmail());
				EmployeeMenu empMenu = new EmployeeMenu("Employee Menu is Displaying now");
				empMenu.captureandhandler();
				
			}
	
		} catch (SQLException e) {
			System.out.println("@@@@@@@@@@@ ERROR @@@@@@@@@@@");
		}

		
		
	}
	

}
