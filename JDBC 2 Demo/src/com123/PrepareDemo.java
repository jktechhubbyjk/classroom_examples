package com123;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PrepareDemo {
	public static void main(String[] args) {
		try {
			// load driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// create connection
			String url = "jdbc:mysql://localhost:3306/batch2";
			String username = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(url, username, password);

			String query = "insert into batch2 values (?,?,?)";

			PreparedStatement pStmt = con.prepareStatement(query);
			pStmt.setInt(1, 56);
			pStmt.setString(2, "Lala");
			pStmt.setString(3, "Punjab");

			int i = pStmt.executeUpdate();
			System.out.println(i + " records updated");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
