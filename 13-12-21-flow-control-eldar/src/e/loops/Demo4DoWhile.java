package e.loops;

import java.util.Scanner;

public class Demo4DoWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int password = 123;
		int input = 0;

		// ======================================
		do {
			System.out.print("enter password: ");
			input = sc.nextInt(); // input operation
		} while (input != password);
		// ======================================

		sc.close();
		System.out.println("you are logged in");

	}

}
