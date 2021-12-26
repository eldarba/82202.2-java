package a;

import java.util.Arrays;

public class Tar {

	public static void main(String[] args) {

		int[] arr1 = new int[15];
		int[] arr2 = new int[15];
		for (int i = 0; i < arr2.length; i++) {
			arr1[i] = (int) (Math.random() * 10);
			arr2[i] = (int) (Math.random() * 10);
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

		// distinct
		int[] distinct1 = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
		int[] distinct2 = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

		for (int i = 0; i < arr1.length; i++) {
			distinct1[arr1[i]] = arr1[i];
			distinct2[arr2[i]] = arr2[i];
		}

		int[] distinct = new int[10];
		int length = 0;
		for (int i = 0; i < distinct.length; i++) {
			int a = distinct1[i];
			int b = distinct2[i];
			if (a != b) {
				distinct[length++] = a != -1 ? a : b;
			}
		}
		int[] arr = new int[length];
		System.arraycopy(distinct, 0, arr, 0, length);
		distinct = arr;
		System.out.println(Arrays.toString(distinct));
	}

}
