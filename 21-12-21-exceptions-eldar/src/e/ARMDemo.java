package e;

import java.util.Scanner;

public class ARMDemo {

	public static void main(String[] args) {

		// ARM - Auto Resource Management - will close any resource
		try (

				Scanner sc = new Scanner(System.in);

				Door door = new Door();

		) {
			door.open();
			System.out.print("enter password: ");
			String pass = sc.nextLine();
			System.out.println(pass);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
