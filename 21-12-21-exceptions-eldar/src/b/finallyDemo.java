package b;

import java.util.Scanner;

public class finallyDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("enter number");
			int x = sc.nextInt();
			System.out.println(x);
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}finally {
			sc.close();
			System.out.println("scanner closed");
		}
		
		System.out.println("== END ==");
		

	}

}
