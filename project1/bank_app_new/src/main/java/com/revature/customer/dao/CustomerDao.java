package com.revature.customer.dao;

import java.sql.SQLException;

import com.revature.model.Account;
import com.revature.model.Customer;

public interface CustomerDao {
	void create(Customer customer) throws SQLException;
	Customer get(String email) throws SQLException;
	

}
