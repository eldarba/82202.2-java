package g.random;

public class Demo3 {

	public static void main(String[] args) {
		int num = 12567;

		while (num != 0) {
			System.out.println(num % 10);
			num = num / 10;
		}
		
		System.out.println("=======");
		System.out.println(num);
	}

}
