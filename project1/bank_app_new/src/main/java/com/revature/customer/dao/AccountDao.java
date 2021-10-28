package com.revature.customer.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.revature.model.Account;

public interface AccountDao {
	void create(Account account) throws SQLException;
	ArrayList<Account> showAccounts() throws SQLException;

	
	


}
