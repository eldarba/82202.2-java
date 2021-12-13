package e.loops;

import java.util.Scanner;

public class Demo3While {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int password = 123;
		System.out.print("enter password: ");
		int input = sc.nextInt(); // input operation

		// ======================================
		int attempts = 1;
		while (input != password && attempts < 3) {
			attempts++;
			System.out.print("wrong password, enter again: ");
			input = sc.nextInt(); // input operation
		}
		// ======================================

		sc.close();
		
		if(input == password) {
			System.out.println("you are logged in");
		}else {
			System.out.println("login failed");
		}

	}

}
