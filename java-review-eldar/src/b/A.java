package b;

public class A {
	
	@Override
	public String toString() {
		System.out.println("toString invoked");
		return "this is A";
	}
	
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a);
//		String x = "aaa" + a + a;
	}

}
