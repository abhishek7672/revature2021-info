package com.revature.menu;

import java.util.Scanner;

import com.revature.form.Form_menu;
import com.revature.model.Customer;
import com.revature.model.Datamanager;

public class Mainmenu extends Menu{

	public Mainmenu(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		addmenuitems("REGISTER as CUSTOMER");
		addmenuitems("LOGIN as CUSTOMER");
		addmenuitems("login as a employee");
		addmenuitems("exit");
	}
	@Override
	public void handler() {
		switch (option) {
		case 1:
			System.out.println("Register new customer");
			System.out.println("-----");
			Scanner sc=new Scanner(System.in);
			System.out.println("first name");
			String firstname=sc.nextLine();
			System.out.println("last name");
			String lastname=sc.nextLine();
			System.out.println("email_id");
			String email=sc.nextLine();
			System.out.println("password");
			String password=sc.nextLine();
			Datamanager.addcustomer(new Customer(firstname,lastname,email,password));
			System.out.println("data is added successfully");
			captureandhandler();
		break;
		case 2:
		
		
			
			
			 Form_menu loginform=new Form_menu("login");
			 loginform.actiononcapturedata();
			 break;
			 
			
			
			
			
			
			
			

		}
	}
}

	

