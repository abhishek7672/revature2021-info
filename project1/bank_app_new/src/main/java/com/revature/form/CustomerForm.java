package com.revature.form;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.customer.dao.Impl.CustomerDaoImp;
import com.revature.model.Customer;

public class CustomerForm extends Form {

	public CustomerForm(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void capturedata() {
		Scanner scanner = new Scanner(System.in);

	System.out.println("First Name");
	String firstName = scanner.nextLine();

	System.out.println("Last Name");
	String lastName = scanner.nextLine();

	System.out.println("Email");
	String email = scanner.nextLine();

	System.out.println("Password: ");
	String password = scanner.nextLine();

//	DataManager.addCustomer(new Customer(firstName, lastName, email, password));
	CustomerDaoImp customerdao = new CustomerDaoImp();
	try {
		customerdao.create(new Customer (firstName , lastName , email , password ));
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(" Customer added Successfully ");

		// TODO Auto-generated method stub
		
	}

	@Override
	public void action() {
		sucess = true;

		// TODO Auto-generated method stub
		
	}

}
