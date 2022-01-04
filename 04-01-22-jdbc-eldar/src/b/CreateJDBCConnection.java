package b;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateJDBCConnection {

	public static void main(String[] args) {
		
		// to get a connection to the database we need:
		// 1. database url
		// 2. user name
		// 3. user password
		// website url
		// https://johnbryce.echo.timetoknow.com/index.html#
		// database url
		// jdbc:mysql://localhost:3306/db2
		String dbUrl = "jdbc:mysql://localhost:3306/db2?createDatabaseIfNotExist=true";
		String user = "root";
		String password = "1234";
		
		// to get a Connection object we need DriverManager
		try (Connection con = DriverManager.getConnection(dbUrl, user, password);){
			System.out.println("connected");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("disconnected");

	}

}
