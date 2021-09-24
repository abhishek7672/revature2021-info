package com.revature.customer.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.customer.dao.AccountDao;
import com.revature.customer.dao.CustomerDao;
import com.revature.customer.dao.Util;
import com.revature.model.Account;
import com.revature.model.Customer;

public class CustomerDaoImp implements CustomerDao{
	public static String currentcustomerid ;

	@Override
	public void create(Customer customer) throws SQLException {
		try (Connection connection = Util.getconnection()) {
			String sql = "INSERT INTO customer ( first_name , last_name, email, password) VALUES (? ,?, ? ,?)";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, customer.getFirstname());
			statement.setString(2, customer.getLastname());
			statement.setString(3, customer.getEmail());
			statement.setString(4, customer.getPassword());
			statement.executeUpdate();
		}

		
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer get(String email) throws SQLException {
		try (Connection connection = Util.getconnection()) {

			String sql = "SELECT * FROM customer where email= ? ";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, email);
			ResultSet resultSet = statement.executeQuery();
			if (resultSet.next()) {
				Customer customer = new Customer();
				customer.setId(resultSet.getInt("id"));
				currentcustomerid = resultSet.getString("email");
				customer.setFirstname(resultSet.getString("first_name"));
				customer.setLastname(resultSet.getString("last_name"));
				customer.setEmail(resultSet.getString("email"));
				customer.setPassword(resultSet.getString("password"));
				
            return customer;
			}
		}
		return null;

		// TODO Auto-generated method stub
		
	}

	/*
	public void create(Account account) throws SQLException {
		// TODO Auto-generated method stub
		try (Connection connection = Util.getconnection()) {
			String sql = "INSERT INTO `account` (`balance`, `firstname`, `lastname`,`branch`,email) VALUES (?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setDouble(1, account.getBalance());
			preparedStatement.setString(2, account.getFirst_name());
			preparedStatement.setString(3, account.getLast_name());
			preparedStatement.setString(4, account.getBranch());
			preparedStatement.setString(5,account.getEmail());
			preparedStatement.executeUpdate();

		}

	}*/


	

}
