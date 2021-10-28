package com.revature.customer.dao;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import com.revature.customer.dao.Impl.AccountDaoImpl;
import com.revature.customer.dao.Impl.CustomerDaoImp;
import com.revature.model.Account;
import com.revature.model.Customer;

class CustomerDaoImplTest {

	@Test
	void test() {
		CustomerDaoImp customerDao = new CustomerDaoImp();
		try {
			customerDao.create(new Customer("DASAf", "fgasf", "hafgsd", "4GHFYf"));
		} catch (SQLException e) {

			fail("Not yet implemented");
		}
	}

	@Test

	void testGet_Success() {
		CustomerDao dao = new CustomerDaoImp();
		try {
			Customer customer = dao.get("tyagi@123");
			assertEquals("kishan", customer.getFirstname() , "Incorrect user returned.");


		} catch (SQLException e) {
			e.printStackTrace();
			fail("Getting employee list failed.");
		}
	}
	@Test
	void test1() {
		AccountDaoImpl AccountDaoImp = new AccountDaoImpl();
		Account account = new Account();
		account.setBalance(1000.00);
		account.setFirst_name("abhi");
		account.setLast_name("singh");
		account.setBranch("Ghaziabad");
		account.setEmail("123");
		try {
			AccountDaoImp.create(account);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("Getting employee list failed.");
		}
	}


}
