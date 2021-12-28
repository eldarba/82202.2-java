package d;

public class TestCalculator {
	public static void main(String[] args) {
		Calculator c = new Calculator();
//		c.add(5);
//		c.mul(100);
//		c.div(3);
//		c.div(0);
//		c.storeResult();
		
		System.out.println("last stored result: " + c.getStoredResult());
	}
}
