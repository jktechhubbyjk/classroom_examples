import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnection {
	// load db driver class
	//create connection object
	// create statement
	//execute query
	public static void main(String[] args) {
		
		try {
			// load db driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			//create connection object
			
			String url="jdbc:mysql://localhost:3306/batch2" ;
			String username="root";
			String password="root";
			
			Connection con = DriverManager.getConnection(url, username, password);
			
			// create statement
			Statement stmt=	con.createStatement();
			
			//execute query
			//String query = "select * from batch2";
			/*String query = "CREATE TABLE `batch2`.`student` (\r\n"
					+ "  `id` INT NOT NULL,\r\n"
					+ "  `name` VARCHAR(45) NULL,\r\n"
					+ "  `location` VARCHAR(45) NULL,\r\n"
					+ "  PRIMARY KEY (`id`));"; */
			
			String query = "CREATE SCHEMA centro";
			int i = stmt.executeUpdate(query);
			/*
			 * ResultSet rs = stmt.executeUpdate(query);
			 * 
			 * while(rs.next()) { System.out.println(rs.getInt(1)
			 * +" "+rs.getString(2)+" "+rs.getString(3)); }
			 */
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
