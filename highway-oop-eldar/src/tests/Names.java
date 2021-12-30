package tests;

public class Names {

	public static void main(String[] args) {
		System.out.println(getRandomName());
		System.out.println(getRandomName());
		System.out.println(getRandomName());
		System.out.println(getRandomName());
		System.out.println(getRandomName());
		System.out.println(getRandomName());
		System.out.println(getRandomName());
		System.out.println(getRandomName());
		System.out.println(getRandomName());
		System.out.println(getRandomName());
		System.out.println(getRandomName());
		System.out.println(getRandomName());
		System.out.println(getRandomName());
		System.out.println(getRandomName());
		System.out.println(getRandomName());
		System.out.println(getRandomName());
		System.out.println(getRandomName());
		System.out.println(getRandomName());
		System.out.println(getRandomName());
		System.out.println(getRandomName());
		System.out.println(getRandomName());
		System.out.println(getRandomName());
		System.out.println(getRandomName());
		System.out.println(getRandomName());
		System.out.println(getRandomName());
		System.out.println(getRandomName());
		System.out.println(getRandomName());

	}

	public static String getRandomName() {
		String[] names = { "Dan", "Ben", "Ron", "Danna", "Mark", "David" };
		int index = (int) (Math.random() * names.length);
		return names[index];
	}

}
