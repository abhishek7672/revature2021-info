package com.revature.main;

import java.util.Scanner;

import com.revature.menu.Mainmenu;
import com.revature.model.Customer;

public class Bankmain {
	private static Scanner scanner = new Scanner(System.in); 
	 private static Customer currentCustomer;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mainmenu mainmenu =new Mainmenu("mainmenu");
		
		mainmenu.captureandhandler();
		
		
		

	}
	public static Scanner getScanner() { return scanner; }

	public static Customer getCurrentCustomer() {
		return currentCustomer;
	}

	public static void setCurrentCustomer(Customer currentCustomer) {
		Bankmain.currentCustomer = currentCustomer;
	}


}
