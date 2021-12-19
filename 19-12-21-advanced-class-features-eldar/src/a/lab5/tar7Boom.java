package a.lab5;

public class tar7Boom {

	public static void main(String[] args) {

		lbl: for (int i = 0; i < 100; i++) {
			if (i % 7 == 0) {
				System.out.println("BOOM");
				continue;
			}

			int copy = i;
			while (copy != 0) {
				if (copy % 10 == 7) {
					System.out.println("BOOM");
					continue lbl;
				}
				copy /= 10;
			}

			System.out.println(i);
		}

	}

}
