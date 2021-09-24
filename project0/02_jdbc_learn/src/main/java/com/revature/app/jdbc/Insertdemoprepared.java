package com.revature.app.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Insertdemoprepared {

	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			Connection connection=	DriverManager.getConnection("jdbc:mysql://localhost:3306/learndb"
						,"root"
						,"12345"
						);
			
			String sql="insert into department(name) values (?)";
			PreparedStatement statement=connection.prepareStatement(sql);
			statement.setString(1, "Reserch");
			statement.executeUpdate();
			statement.setString(1, "statistics");
			statement.executeUpdate();
			connection.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		// TODO Auto-generated method stub
   
	}

}
