package e;

public class Calculator {
	
	public int sum(int a, int b) {
		return a + b;
	}

	public int sum(int a, int b, int c) {
		return a + b + c;
	}
	public int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		
		System.out.println(c.sum(4, 9));
		System.out.println(c.sum(4, 9, 5));
		
		int[] numbers = {3,5,7,3,1,33,5};
		System.out.println(c.sum(numbers));
		
		System.out.println(2);
		System.out.println(2.3);
		System.out.println("aaaa");
	}

}
