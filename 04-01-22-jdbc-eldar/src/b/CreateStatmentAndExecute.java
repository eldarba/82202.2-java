package b;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateStatmentAndExecute {

	public static void main(String[] args) {
		
		String dbUrl = "jdbc:mysql://localhost:3306/db2";
		String user = "root";
		String password = "1234";
		
		// define an sql as String
		String sql = "create table person(id int, name varchar(25))";
		
		try (Connection con = DriverManager.getConnection(dbUrl, user, password);){
			// use the connection to get a Statement object
			Statement stmt = con.createStatement();
			// execute the sql
			stmt.executeUpdate(sql);
			System.out.println(sql);
		} catch (SQLException e) {
			System.err.println(sql);
			e.printStackTrace();
		}
		

	}

}
