package com.revature.customer.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.customer.dao.Util;

import com.revature.customer.dao.EmployeeDao;
import com.revature.model.Account;
import com.revature.model.Customer;
import com.revature.model.Employee;
import com.revature.model.Transaction;

public class EmployeeDaoImp implements EmployeeDao {

	@Override
	public List<Customer> viewCustomer() throws SQLException {
		List<Customer> customerList = new ArrayList<>();
		try (Connection connection = Util.getconnection()) {
			String sql = "select * from customer";
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();
			while(resultSet.next()) {
				Customer customer = new Customer();
				customer.setFirstname(resultSet.getString("first_name"));
				customer.setLastname(resultSet.getString("last_name"));
				customer.setId(resultSet.getInt("id"));
				customer.setEmail(resultSet.getString("email"));
				customer.setPassword(resultSet.getString("password"));
				customerList.add(customer);
			}
		return customerList;
		}
	}
	

		// TODO Auto-generated method stub
		



	@Override
	

		public List<Account> viewAccount() throws SQLException {
		List<Account> accountList = new ArrayList<>();
		try (Connection connection = Util.getconnection()) {
			String sql ="select * from customer inner join "
					+ "account on customer.email = account.email";

			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				Account account = new Account();
				account.setAccountno(resultSet.getInt("accountno"));
				account.setBalance(resultSet.getDouble("balance"));
				account.setFirst_name(resultSet.getString("firstname"));
				account.setFirst_name(resultSet.getString("lastname"));
				account.setBranch(resultSet.getString("branch"));
				accountList.add(account);

			}
		}
		return accountList;

		
	}
	public Employee getEmployeeEmail(String email) throws SQLException {
		Employee employee = null;
		
		try (Connection connection = Util.getconnection()){
			String sql = "select * from employee where email = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			
			statement.setString(1, email);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				
				String email_id = resultSet.getString("email");
				String password = resultSet.getString("password");
				
				employee = new Employee(email_id, password);
			}
		}
		return employee;

		
	}


	@Override
	public List<Transaction> viewTransaction() throws SQLException {
		// TODO Auto-generated method stub
		List<Transaction> transactionList = new ArrayList<>();
		try (Connection connection = Util.getconnection()) {
			String sql = "select * from transaction";
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				Transaction transactionTemp = new Transaction();
				transactionTemp.setType(resultSet.getString("type").charAt(0));
				transactionTemp.setAmount(resultSet.getDouble("amount"));
				transactionTemp.setAccountId(resultSet.getInt("account_id"));
				transactionList.add(transactionTemp);

			}
		}
		return transactionList;

		
		
	}



	}



