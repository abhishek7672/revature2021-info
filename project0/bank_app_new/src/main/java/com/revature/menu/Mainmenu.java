package com.revature.menu;

import java.util.Scanner;

import com.revature.form.CustomerForm;
import com.revature.form.EmployeeReg;
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
		Scanner scanner = new Scanner(System.in);

		switch (option) {
		case 1:
			/*System.out.println("Register new customer");
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
			System.out.println("data is added successfully");*/
			CustomerForm cus = new CustomerForm("Customer  Form");
			cus.capturedata();
			
			// CustomerDao dao = new CustometDaoImpl();
			// dao.create(new Customer(firstName, lastName, email, password));
			System.out.println("Customer added Sucessfully");


			captureandhandler();
		break;
		case 2:

			Form_menu loginForm = new Form_menu("Login Form");
			loginForm.actiononcapturedata();
			captureandhandler();
			break;
		
		case 3:
			EmployeeReg empLogin = new EmployeeReg("employee Login");
			empLogin.actiononcapturedata();
			captureandhandler();
			break;
		
		case 4:
			System.out.println("finished");
			break;

		
		
			
			
			 
			 
			
			
			
			
			
			
			

		}
	}
}

	

