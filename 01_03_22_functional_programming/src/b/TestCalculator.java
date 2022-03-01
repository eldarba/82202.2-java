package b;

public class TestCalculator {

	public static void main(String[] args) {

		// add (long version syntax)
		Calculator add = (a, b) -> {
			return a + b;
		};

		// subtract
		Calculator sub = (a, b) -> a - b;
		
		// multiply
		Calculator mul = (a, b) -> a * b;

		// divide
		Calculator div = (a, b) -> a / b;

		int a = 5;
		int b = 3;

		System.out.println(add.calculate(a, b));
		System.out.println(sub.calculate(a, b));
		System.out.println(mul.calculate(a, b));
		System.out.println(div.calculate(a, b));

	}

}
