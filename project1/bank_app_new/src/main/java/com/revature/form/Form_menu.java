package com.revature.form;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.customer.dao.CustomerDao;
import com.revature.customer.dao.Impl.CustomerDaoImp;
import com.revature.menu.CustomerMainMenu;
import com.revature.model.Customer;
import com.revature.model.Datamanager;

public class Form_menu extends Form {
public Form_menu(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}



private String email;
private String password;
	@Override
	public void capturedata() {
		Scanner sc=new Scanner(System.in);

		System.out.println("email_id");
		
		 email=sc.nextLine();
		System.out.println("password");
		  password=sc.nextLine();
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public void action() {
		// TODO Auto-generatCustomer customer =Datamanager.getcustomer(email);
	//	Customer customer=Datamanager.getcustomer(email);
		CustomerDao dao = new CustomerDaoImp();
		Customer customer = null;
		try {
			customer = dao.get(email);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

		 if(customer==null) {
			 System.out.println("details are invalid");
			 
		 }
		 else if(customer.getPassword().equals(password)) {
			 sucess=true;
			 System.out.println("login successfully");
			 CustomerMainMenu menu = new CustomerMainMenu("Customer Main Menu");
				menu.captureandhandler();
				System.out.println("Welcome " + customer.getFirstname());

		 }
		 else {
			 System.out.println("invalid details");
		 }
		
	}
	

}
