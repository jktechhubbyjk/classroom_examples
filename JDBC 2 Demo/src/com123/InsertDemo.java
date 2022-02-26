package com123;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDemo {
	public static void main(String[] args) {
		try {
			//load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// create connection
			String url="jdbc:mysql://localhost:3306/batch2";
			String username = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(url,username,password);
			
			// create statement
			
			Statement stmt = con.createStatement();
			
			//String query = "insert into batch2 values (114, 'Vijay' , 'Goa')";
			//String query = "delete from batch2 where id = 102";
			String query = "create schema rest";
			
			int i = stmt.executeUpdate(query);
			System.out.println(i +" records updated");
			
			
	}catch(Exception e) {
		e.printStackTrace();
		
	}
	}
}
