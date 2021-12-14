package a;

public class Demo2 {

	public static void main(String[] args) {
		// int array of length 100
		int[] grades = new int[100];

		// populate array with random data and print
		for (int i = 0; i < grades.length; i++) {
			grades[i] = (int) (Math.random() * 41) + 60;
			System.out.println(grades[i]);
		}

	}

}
