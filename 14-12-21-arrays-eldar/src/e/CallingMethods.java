package e;

public class CallingMethods {
	
	public static void main(String[] args) {
		double res;
		
		// method invocation 
		res = add(5.5, 11.3);
		System.out.println(res);
		
		res = sub(10, 3.5);
		System.out.println(res);
		
		sayHi();
	}

	
	// method definition
	// method signature:
	// 1. return type	[double]
	// 2. method name	identifier [add]
	// 3. parameters	[(double a, double b)]
	public static double add(double a, double b) {
		return a + b;
	} 

	public static double sub(double a, double b) {
		return a - b;
	}
	
	public static void sayHi() {
		System.out.println("Hi");
	}

}
