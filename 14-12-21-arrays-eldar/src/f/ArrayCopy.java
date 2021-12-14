package f;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {

		int[] arr1 = { 2, 4, 6 };
		System.out.println(Arrays.toString(arr1));
		
		int[] temp = new int[arr1.length + 2];
		System.out.println(Arrays.toString(temp));
		
		System.arraycopy(arr1, 0, temp, 0, arr1.length);
		System.out.println(Arrays.toString(temp));
		
		arr1 = temp;
		System.out.println(Arrays.toString(arr1));
		
		
		
		

	}

}
