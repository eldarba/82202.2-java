package e.operators;

public class Demo2 {

	public static void main(String[] args) {
		int x = 5;

		x = x + 1;
		x += 1;
		x++;
		
		System.out.println(x);

		System.out.println(x++); // print then increment
		System.out.println(x);

		System.out.println(++x); // increment then print
		
		///////////////////
		
		int a = 5;
		int b = ++a; // a=6, b=6
		int c = a++; // c=6, a=7
		
		// Increment 
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
	}

}
