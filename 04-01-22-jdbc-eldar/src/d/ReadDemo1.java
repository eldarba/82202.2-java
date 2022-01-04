package d;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadDemo1 {

	public static void main(String[] args) {
		
		String dbUrl = "jdbc:mysql://localhost:3306/db2";
		String user = "root";
		String password = "1234";
		
		try(Connection con = DriverManager.getConnection(dbUrl, user, password)){
			String sql = "select * from person";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			rs.next(); // move to next row of the result set
			rs.next(); // move to next row of the result set
			
			// id from column 1 - id
//			int id = rs.getInt("id");
			int id = rs.getInt(1);
			// name from column 2 - name
//			String name = rs.getString("name");
			String name = rs.getString(2);
			// print
			System.out.println("id: " + id + ", name: " + name);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
