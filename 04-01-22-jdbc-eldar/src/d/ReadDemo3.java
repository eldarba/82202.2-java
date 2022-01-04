package d;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadDemo3 {

	public static void main(String[] args) {
		String dbUrl = "jdbc:mysql://localhost:3306/db1";
		String user = "root";
		String password = "1234";

		try (Connection con = DriverManager.getConnection(dbUrl, user, password)) {
			String sql = "select * from book";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {

				int id = rs.getInt(1);
				int authorId = rs.getInt(2);
				String title = rs.getString(3);
				Date publication = rs.getDate(4);
				double price = rs.getDouble(5);

				System.out.println("book details:");
				System.out.println("id: " + id);
				System.out.println("author id: " + authorId);
				System.out.println("title: " + title);
				System.out.println("publication: " + publication);
				System.out.println("price: " + price);
				System.out.println("===============================");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
