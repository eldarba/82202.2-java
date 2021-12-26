package f.arm;

import java.util.Scanner;

public class Demo1NoArm {

	public static void main(String[] args) {
		
		String str = "aaa bbb ccc ddd";
		Scanner sc = new Scanner(str);
		try {
			System.out.println(sc.next());
			System.out.println(sc.next());
			System.out.println(sc.next());
			System.out.println(sc.next());
			System.out.println(sc.next());
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sc.close();
			System.out.println("scanner closed");
		}
		

	}

}
