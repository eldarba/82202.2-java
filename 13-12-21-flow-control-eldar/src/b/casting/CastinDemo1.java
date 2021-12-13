package b.casting;

public class CastinDemo1 {

	public static void main(String[] args) {

		// casting is converting from one type to another
		byte a = 5;
		int b = a; // implicit casting from byte to int

		int x = 129;
		byte y = (byte) x; // explicit casting from int to byte

		System.out.println(y);

		float f1 = 5.3F;
		long num = (long) f1; // explicit casting from float to long

		System.out.println(f1);
		System.out.println(num);

		// casting operator:
		// (type)val

	}

}
