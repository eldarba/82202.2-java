package b;

public class TestNumber {

	public static void main(String[] args) {

//		Number times2 = (val) -> val * 2;
		Number times2 = val -> val * 2;

		int val = 100;

		System.out.println(times2.calculate(val));
		// ==========================
		System.out.println("===============");

		int res = m(100, x -> x * 5);
		System.out.println(res);

	}

	static int m(int val, Number number) {
		return number.calculate(val);
	}

}
