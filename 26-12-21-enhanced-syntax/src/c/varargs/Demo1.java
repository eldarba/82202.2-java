package c.varargs;

public class Demo1 {
	
	public static void main(String[] args) {
		
		System.out.println(sum(8, 6));
		System.out.println(sum(8, 6, 4));
		System.out.println(sum(8, 6, 4, 5, 4, 6, 7, 8));
		System.out.println(sum("Eldar", 8, 6, 4, 5, 4, 6, 7, 8));
		
		sayHelloTo("aaa", "bbb", "ccc");
	}
	
	public static int sum(int a, int b) {
		System.out.println(1);
		return a + b;
	}
	
	public static int sum(int a, int b, int c) {
		System.out.println(2);
		return a + b + c;
	}

	// varargs - we can send any number of arguments
	public static int sum(int... values) {
		System.out.println(3);
		int sum = 0;
		for (int val : values) {
			sum += val;
		}
		return sum;
	}

	
	// varargs - must be last parameters
	public static int sum(String name, int... values) {
		System.out.println(4 + ", name: " + name);
		int sum = 0;
		for (int val : values) {
			sum += val;
		}
		return sum;
	}
	
	public static void sayHelloTo(String... names) {
		System.out.println("greeting all:");
		for (String name : names) {
			System.out.println("Hello " + name);
		}
	}

}
