package b.forEach;

public class Demo1 {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 6, 8 };

		// for loop (index)
		for (int i = 0; i < arr.length; i++) {
			int x = arr[i];
			System.out.println(x);
		}
		
		System.out.println("================");
		// for each loop
		for(int x : arr) {
			System.out.println(x);
		}

	}

}
