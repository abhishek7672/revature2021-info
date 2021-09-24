package com.revature.model;

import com.revature.customer.dao.Impl.AccountDaoImpl;

public class Transaction {
	private int customerId;
	private String name;
	private String accountNumber;
	private double initialAmount;
	private int accountId;
	private char type;
	private double amount;
	private boolean success = true;
	AccountDaoImpl accdao = new AccountDaoImpl();
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getInitialAmount() {
		return initialAmount;
	}
	public void setInitialAmount(double initialAmount) {
		this.initialAmount = initialAmount;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Transaction(char type, double amount) {
		super();
		this.type = type;
		this.amount = amount;
	}
	
public char getType() {
		return type;
	}
	public void setType(char type) {
		this.type = type;
	}
public Transaction(){
	
}
@Override
public String toString() {
	return "Transaction [accountId=" + accountId + ", type=" + type + ", amount=" + amount + "]";
}

}
