package com123;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class DBDemo {
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
			
			// create query and execute
			
			String query = "select * from batch2";
			
			ResultSet rs =    stmt.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getInt(1) +" "+rs.getString(2) +" "+rs.getString(3));
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
