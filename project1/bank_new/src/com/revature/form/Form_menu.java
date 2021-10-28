package com.revature.form;

import java.util.Scanner;

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
		Customer customer=Datamanager.getcustomer(email);
		 if(customer==null) {
			 System.out.println("details are invalid");
			 
		 }
		 else if(customer.getPassword().equals(password)) {
			 sucess=true;
			 System.out.println("login successfully");
		 }
		 else {
			 System.out.println("invalid details");
		 }
		
	}
	

}
