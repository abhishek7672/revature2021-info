package com.revature.model;

import java.sql.SQLException;

import com.revature.customer.dao.Impl.AccountDaoImpl;

public class Account {
	private String branch;
	private double balance;
	private String first_name;
	private String last_name;
	private long accountno;
	private String email;
	private boolean success = true;
	AccountDaoImpl accdao = new AccountDaoImpl();

	public Account() {
		
	}
	public Account( double balance,String branch, String first_name, String last_name,String email) {
		super();
		this.branch = branch;
		this.balance = balance;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email=email;
	}

	public Account(double balance, long accountno) {
		super();
		this.balance = balance;
		this.accountno = accountno;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public long getAccountno() {
		return accountno;
	}
	public void setAccountno(long accountno) {
		this.accountno = accountno;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Account [branch=" + branch + ", balance=" + balance + ", first_name=" + first_name + ", last_name="
				+ last_name + ", accountno=" + accountno + "]";
	}
	public double withdraw(double withdrawAmount) {
		while (success) {
//			System.out.println("Enter amount: ");
//			double withdrawAmount = sc.nextDouble();
			if (withdrawAmount < 0) {
				System.out.println("Enter Amount greater than 0");
			} else if (withdrawAmount <= balance) {
				balance -= withdrawAmount;
				success = false;
				try {
					accdao.insert(new Transaction('D', withdrawAmount));
					accdao.update(this);
					System.out.println("Successfull");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} else {
				System.out.println("Insufficient funds");
			}

		}
		return balance;
	}
	public void transfer(double amount) {
		balance += amount;
		try {
			accdao.insertTransfer(new Transaction('C', amount));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			accdao.updateTransfer(this);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public double deposit(double depositAmount) {
		while (success) {
			if (depositAmount < 0) {
				System.out.println("Enter Amount greater than 0");
			} else {
				balance += depositAmount;
				success = false;
				try {
					accdao.insert(new Transaction('C', depositAmount));
					accdao.update(this);
					System.out.println("Successfull");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return balance;
	}



	
	

}
