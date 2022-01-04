package b;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateStatmentAndExecuteUpdate {

	public static void main(String[] args) {
		
		String dbUrl = "jdbc:mysql://localhost:3306/db2";
		String user = "root";
		String password = "1234";
		
		String sql = "update person set name = 'Yosi' where id = 205";
		
		try (Connection con = DriverManager.getConnection(dbUrl, user, password);){
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
			System.out.println(sql);
		} catch (SQLException e) {
			System.err.println(sql);
			e.printStackTrace();
		}
		

	}

}
