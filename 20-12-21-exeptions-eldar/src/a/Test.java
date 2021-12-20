package a;

public class Test {

	public static void main(String[] args) {
		Calculator c = new Calculator();

		try {
			int res = c.div(10, 0);
			System.out.println(res);
		} catch (Exception e) {
			// handler code
			System.out.println("the divide method failed: " + e.getMessage());
		}
		
		

		System.out.println("=== END ===");
	}

}
