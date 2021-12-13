package g.random;

public class Demo1 {

	public static void main(String[] args) {
		int r1 = (int) (Math.random() * 11); // 0 - 10
		int r2 = (int) (Math.random() * (20-10+1)) + 10; // 10 - 20

		int a = 3;
		int b = 5;
		int r3 = (int) (Math.random() * (b - a + 1)) + a; // 10 - 20
		double r4 = (Math.random() * (b - a)) + a; // 10 - 20

		System.out.println(r3);
		System.out.println(r4);
	}

}
