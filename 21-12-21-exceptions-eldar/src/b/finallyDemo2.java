package b;

import java.util.Scanner;

public class finallyDemo2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("enter number");
			int x = sc.nextInt();
			System.out.println(x);
		}finally {
			sc.close();
			System.out.println("scanner closed");
		}
		
		System.out.println("== END ==");
		

	}

}
