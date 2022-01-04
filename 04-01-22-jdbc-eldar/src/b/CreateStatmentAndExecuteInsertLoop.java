package b;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateStatmentAndExecuteInsertLoop {

	public static void main(String[] args) {
		
		String dbUrl = "jdbc:mysql://localhost:3306/db2";
		String user = "root";
		String password = "1234";
		
		
		try (Connection con = DriverManager.getConnection(dbUrl, user, password);){
			Statement stmt = con.createStatement();
			
			for (int i = 201; i <= 300; i++) {
				String sql = "insert into person values(" + i + ", 'p-" + i + "')";
				stmt.executeUpdate(sql);
				System.out.println(sql);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
