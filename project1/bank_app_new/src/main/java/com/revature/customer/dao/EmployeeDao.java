package com.revature.customer.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.model.Account;
import com.revature.model.Customer;
import com.revature.model.Transaction;

//import com.revature.bankapp.model.Account;
//import com.revature.bankapp.model.Customer;

public interface EmployeeDao {
	List<Customer> viewCustomer() throws SQLException;

	List<Account> viewAccount() throws SQLException;

	List<Transaction> viewTransaction() throws SQLException;
}


