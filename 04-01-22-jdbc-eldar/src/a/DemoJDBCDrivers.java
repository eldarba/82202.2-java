package a;

import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

public class DemoJDBCDrivers {

	public static void main(String[] args) {

		// to get available jdbc drivers use java.sql.DriverManager
		Enumeration<Driver> drivers = DriverManager.getDrivers();

		// now we iterate over the Enumeration and print the drivers
		System.out.println("available jdbc drivers:");
		while (drivers.hasMoreElements()) {
			Driver driver = drivers.nextElement();
			System.out.println(driver);
		}
		System.out.println("=========================");

	}

}
