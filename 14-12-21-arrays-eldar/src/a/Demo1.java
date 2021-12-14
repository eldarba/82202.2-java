package a;

public class Demo1 {
	
	public static void main(String[] args) {
		// create an array of int - length 5
		int[] arr = new int[5];
		System.out.println("length: " + arr.length);
		
		arr[3] = 7; // add element
		
		// print the array elements
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		// System.out.println(arr[5]); // out of range for length 5
		
	}

}
