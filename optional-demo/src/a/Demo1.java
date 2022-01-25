package a;

import java.util.Optional;

public class Demo1 {

	public static void main(String[] args) {

		Optional<String> opt1 = Optional.of("AAA"); // present optional
		Optional<String> opt2 = Optional.empty(); // empty optional

		System.out.println("is opt1 present? " + opt1.isPresent());
		System.out.println("is opt2 present? " + opt2.isPresent());

		System.out.println("=================");

		if (opt1.isPresent()) {
			String str = opt1.get();
			System.out.println("opt1 content: " + str);
		} else {
			System.out.println("opt1 content: EMPTY");
		}

		if (opt2.isPresent()) {
			String str = opt2.get();
			System.out.println("opt2 content: " + str);
		} else {
			System.out.println("opt2 content: EMPTY");
		}

		System.out.println("========================");
		Optional<Company> opt = getCompany(14);
		if (opt.isPresent()) {
			Company c = opt.get();
			System.out.println(c);
		} else {
			System.out.println("NOT FOUND");
		}

	}

	public static Optional<Company> getCompany(int id) {
		Optional<Company> opt;
		if (id <= 10) {
			// if found - return a present optional
			opt = Optional.of(new Company());
		} else {
			// if NOT found - return an empty optional
			opt = Optional.empty();
		}
		return opt;
	}

}
