package com.revature.menu;

import java.sql.SQLException;
import java.util.ArrayList;

import com.revature.customer.dao.EmployeeDao;
import com.revature.customer.dao.Impl.EmployeeDaoImp;
import com.revature.form.AccountReg;
import com.revature.form.CustomerForm;
import com.revature.form.Form_menu;
import com.revature.model.Account;
import com.revature.model.Customer;
import com.revature.model.Transaction;

public class EmployeeMenu extends Menu {
	public EmployeeMenu(String name) {
		super(name);
		addmenuitems("register for customer account");
		addmenuitems("view customer");
		addmenuitems("view accounts");
		addmenuitems("view transaction");
		
		addmenuitems("Logout");

		
	}

	@Override
	public void handler() {
		// TODO Auto-generated method stub
		EmployeeDao edao = new EmployeeDaoImp();
		switch(option) {
		case 1:
			CustomerForm signUp = new CustomerForm("Customer SignUp");
			signUp.actiononcapturedata();
			
			Form_menu logiForm = new Form_menu("Customer Login");
			logiForm.actiononcapturedata();
			
			
			AccountReg createAcc = new AccountReg("Account details");
			createAcc.actiononcapturedata();
			
			captureandhandler();
		

			System.out.println("welcome");
			break;
		
			
case 2:
			try {
				ArrayList<Customer> acc = (ArrayList<Customer>) edao.viewCustomer();
				acc.forEach(System.out::println);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			captureandhandler();
			break;

			
		case 3:
			try {
				ArrayList<Account> acc = (ArrayList<Account>) edao.viewAccount();
				acc.forEach(System.out::println);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			captureandhandler();
			break;
		case 4:
			try {
				ArrayList<Transaction> trans = (ArrayList<Transaction>) edao.viewTransaction();
				trans.forEach(System.out::println);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		captureandhandler();
		break;

			
		case 5:
			Mainmenu mainmenu = new Mainmenu("Main Menu");
			mainmenu.displaymenu();
			break;
		}

			
		}

		
		
	}
	


