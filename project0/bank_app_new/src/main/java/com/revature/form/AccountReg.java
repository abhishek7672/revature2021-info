package com.revature.form;

import static org.junit.Assert.fail;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.customer.dao.Impl.AccountDaoImpl;
import com.revature.customer.dao.Impl.CustomerDaoImp;
import com.revature.model.Account;

public class AccountReg extends Form {
	double balance;
	String branch;
	String last_name;
	String first_name;
	String email;
	

	public AccountReg(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void capturedata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the balance");
		 balance = sc.nextDouble();
		System.out.println("Enter branch name");
		 branch = sc.next();
		 System.out.println("Enter your First Name : ");
			first_name= sc.next();
			System.out.println("Enter your Last name : ");
			last_name = sc.next();
			System.out.println("enter email");
			email=sc.next();
			
			System.out.println("Account Creat Sucessfully...");

		//sc.close();

		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void action() {
		AccountDaoImpl AccountDaoImpl = new AccountDaoImpl();
		
		try {
			AccountDaoImpl.create(new Account (balance , branch , first_name , last_name,email));
		} catch (SQLException e) {
			
			e.printStackTrace();
			fail("Getting employee list failed.");
		}
		

		sucess=true;
		// TODO Auto-generated method stub
		
	}

}
