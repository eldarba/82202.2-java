package d;

import java.util.Scanner;

public class SwitchDemo3Input {

	public static void main(String[] args) {
		// input from user ======================================
		Scanner sc = new Scanner(System.in); // input from keyboard
		System.out.print("enter day: ");
		String day = sc.nextLine();
		sc.close(); // close the scanner
		// =======================================================
		System.out.println(day); // print the user input
		
		switch (day) {
		case "sunday":
		case "monday":
		case "wednesday":
		case "thursday":
			System.out.println("leave at 16:30");
			break;
		case "tuesday":
			System.out.println("leave at 12:30");
			break;
		case "friday":
		case "saturday":
			System.out.println("go home - it's weekend");
			break;

		default:
			System.out.println(day + " is not a day");
		}

		System.out.println("=== END ===");
	}

}
