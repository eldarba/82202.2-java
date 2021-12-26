package f.arm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo2WithArm {

	public static void main(String[] args) throws FileNotFoundException {

		String str = "aaa bbb ccc ddd";

		// ARM - the scanner will be closed automatically
		// whether an exception occurred or not because of parentheses
		try (Scanner sc = new Scanner(str); FileInputStream in = new FileInputStream("c:/file");) {
			System.out.println(sc.next());
			System.out.println(sc.next());
			System.out.println(sc.next());
			System.out.println(sc.next());
			System.out.println(sc.next());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("scanner closed");

	}

}
