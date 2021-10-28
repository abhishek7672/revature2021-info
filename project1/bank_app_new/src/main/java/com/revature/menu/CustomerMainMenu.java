package com.revature.menu;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.revature.customer.dao.Impl.AccountDaoImpl;
import com.revature.form.AccountReg;
import com.revature.model.Account;


public class CustomerMainMenu extends Menu{

	public CustomerMainMenu(String name) {
	
			super(name);
			addmenuitems("Create new account");
			addmenuitems("View Accounts");
			addmenuitems("transaction");
			addmenuitems("logout");
			captureandhandler();

		
		// TODO Auto-generated constructor stub
	
	}
	@Override
	public void handler() {
	
	Scanner sc=new Scanner(System.in);
	switch (option) {
	case 1:
		AccountReg accountRegistrationForm = new AccountReg("New Account registartion form");
		accountRegistrationForm.actiononcapturedata();
		captureandhandler();
		break ;
	case 2:
		AccountDaoImpl adao = new AccountDaoImpl();
		try {
			ArrayList<Account >account = adao.showAccounts();
			account.forEach(System.out::println);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		captureandhandler();
		break;
	case 3:
		
		
					TransactionMenu tMenu = new TransactionMenu("Transaction Menu");
					tMenu.getAccount();
					tMenu.captureandhandler();
					break;
					


	case 4:
		System.out.println("You have loged out Sucessfully");
		break;
		
	}


		
		
		
		
	

		
	}
		
		
		// TODO Auto-generated method stub
		
	}
	


