package com.revature.menu;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.customer.dao.Impl.AccountDaoImpl;
public class TransactionMenu extends Menu {
	public static String accNumber;
	Scanner scanner = new Scanner(System.in);
	public static String transferAccNum;

	

	public TransactionMenu(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		addmenuitems("Deposit");
		addmenuitems("Withdraw");
		addmenuitems("transfer money");
	}

	

	@Override
	public
	void handler() {
		// TODO Auto-generated method stub
		AccountDaoImpl accdao = new AccountDaoImpl();

		switch(option) {
		case 1:
			System.out.println("Enter Amount to deposit");
			double dep = scanner.nextDouble();
			try {
				accdao.currentAccount().deposit(dep);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 2:
			System.out.println("Enter Amount to Withdraw");
			double wed = scanner.nextDouble();
			try {
				accdao.currentAccount().withdraw(wed);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 3:
			System.out.println("Enter Account numbet to be transfered");
			transferAccNum = scanner.nextLine();
			System.out.println("Enter Amount to Transfer");
			double tAmount = scanner.nextDouble();
			try {
				accdao.currentAccount().withdraw(tAmount);
				accdao.transferAccount().transfer(tAmount);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
           
		
			
			
		}
	}
	public String getAccount() {
		System.out.println("Enter Account number to make transaction: ");
		
		accNumber = scanner.nextLine();
		System.out.println("Account Number: " + accNumber);
		return accNumber;
	}


}
