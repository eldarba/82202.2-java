package a;

public class ConcatDemo2 {

	public static void main(String[] args) {

		System.out.println(Math.random()); // 0 - 0.99999
		System.out.println(Math.random() * 11); // 0 - 10.99999
		System.out.println((int) (Math.random() * 11)); // 0 - 10
		System.out.println("==============");
		
		// x : 0 - 100 inclusive
		int x = (int) (Math.random() * 101);
		int y = (int) (Math.random() * 101);
		System.out.println(x + " + " + y + " = " + (x+y));
		System.out.println(x + " - " + y + " = " + (x-y));
		System.out.println(x + " * " + y + " = " + (x*y));
		System.out.println(x + " / " + y + " = " + (x/y));
		System.out.println(x + " / " + y + " = " + ((x+0D)/y));

	}

}
