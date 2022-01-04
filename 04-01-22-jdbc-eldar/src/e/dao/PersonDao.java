package e.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// DAO - Data Access Object
// CRUD actions using objects
public class PersonDao {

	private String dbUrl = "jdbc:mysql://localhost:3306/db2";
	private String user = "root";
	private String password = "1234";

	// create
	public void save(Person person) {
		try (Connection con = DriverManager.getConnection(dbUrl, user, password)) {
			String sql = "insert into person values(?, ?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, person.getId());
			pstmt.setString(2, person.getName());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException("save person failed", e);
		}
	}

	// read
	public Person get(int id) {
		try (Connection con = DriverManager.getConnection(dbUrl, user, password)) {
			String sql = "select * from person where id = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				Person p = new Person(rs.getInt(1), rs.getString(2));
				return p;
			} else {
				return null;
			}
		} catch (SQLException e) {
			throw new RuntimeException("read person failed", e);
		}
	}

	// update
	public void update(Person person) {
		try (Connection con = DriverManager.getConnection(dbUrl, user, password)) {
			String sql = "update person set name = ? where id = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, person.getName());
			pstmt.setInt(2, person.getId());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException("update person failed", e);
		}
	}

	// delete
	public void delete(int id) {
		try (Connection con = DriverManager.getConnection(dbUrl, user, password)) {
			String sql = "delete from person where id = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			int rowCount = pstmt.executeUpdate();
			if (rowCount == 0) {
				throw new RuntimeException("delete person " + id + " failed - not found");
			}
		} catch (SQLException e) {
			throw new RuntimeException("delete person failed", e);
		}
	}
}
