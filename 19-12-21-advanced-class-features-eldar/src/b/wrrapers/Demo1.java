package b.wrrapers;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		
		int a = 5; // primitive
		Integer x = 5; // object
		
		// minimum and maximum
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number:");
		String input = sc.nextLine();
		System.out.println(input);
		
		// parse methods - convert text to numbers
		int val = Integer.parseInt(input);
		System.out.println(val * 2);

	}

}
