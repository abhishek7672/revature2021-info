package com.revature.app.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class JDBCdemo {

	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			Connection connection=	DriverManager.getConnection("jdbc:mysql://localhost:3306/learndb"
						,"root"
						,"12345"
						);
			System.out.println("Connection successful");
			Statement statement=connection.createStatement();
			statement.executeUpdate("insert into department(name) values ('innovation')");
			connection.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			} catch (SQlException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			}catch(SQlException e) {
				e.printStackTrace();
			}
		}
		// TODO Auto-generated method stub
   
	}

}
