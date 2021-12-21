package a;

import java.util.Date;

public class Demo1RuntimeExceptions {

	public static void main(String[] args) {

		try {
			Object obj = new Date();
			obj = "aaa";
			obj = 5;
			String str2 = (String) obj;
			System.out.println(str2);

			String n = "1A2";
			int x = Integer.parseInt(n);
			System.out.println(x);

			int[] arr1 = new int[10];
			System.out.println(arr1[10]);

			int[] arr2 = new int[-1];

			String str = "aaa";
			System.out.println(str.length());
			str = null;
			System.out.println(str.length());

			System.out.println(3 / 0);
		} catch (RuntimeException e) {
			e.printStackTrace(System.out);
		}finally {
			System.out.println("finally - do it anyway block");
		}

		System.out.println("== END ==");
	}

}
