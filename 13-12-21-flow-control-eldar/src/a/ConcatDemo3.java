package a;

/**
 * create a random number in the range 0 - 10,000. 
 * print it and print its right digit.
 */
public class ConcatDemo3 {

	public static void main(String[] args) {

		int x = (int) (Math.random() * 10_001);
		System.out.println(x);
		System.out.println(x % 10);
	}

}
