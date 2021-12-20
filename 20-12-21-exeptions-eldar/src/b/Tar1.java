package b;

import java.util.Scanner;

public class Tar1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("enter first number: ");
			int a = sc.nextInt();
			System.out.print("enter second number: ");
			int b = sc.nextInt();
			System.out.println(a + " + " + b + " = " + (a+b));
		} catch (Exception e) {
			System.out.println("you entered wrong input");
		}
		
		sc.close();
		System.out.println("==end of program==");

	}

}
