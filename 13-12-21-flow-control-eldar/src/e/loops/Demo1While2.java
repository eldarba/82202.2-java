package e.loops;

import java.util.Scanner;

public class Demo1While2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int password = 123;
		System.out.print("enter password: ");
		int input = sc.nextInt(); // input operation

		// ======================================
		while (input != password) {
			System.out.print("wrong password, enter again: ");
			input = sc.nextInt(); // input operation
		}
		// ======================================

		sc.close();
		System.out.println("you are logged in");

	}

}
