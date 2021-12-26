package z.task;

import java.util.Arrays;

public class TaskFlowControl {

	public static void main(String[] args) {

		int[] arr1 = new int[15];
		int[] arr2 = new int[15];

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = (int) (Math.random() * 10);
			arr2[i] = (int) (Math.random() * 10);
		}

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

		int max = 0;

		for (int i = 0; i < arr1.length - 2; i++) {
			int val1 = arr1[i] * 100 + arr1[i + 1] * 10 + arr1[i + 2];
			int val2 = arr1[i] + arr1[i + 1] * 10 + arr1[i + 2] * 100;
			int val = val1 > val2 ? val1 : val2; // ternary operator
			if (max < val) {
				max = val;
			}
		}
		System.out.println(max);

		int[] distinct = new int[10];
		for (int i = 0; i < distinct.length; i++) {
			distinct[i] = -1;
		}

		int[] u1 = new int[10];
		for (int i = 0; i < u1.length; i++) {
			u1[i] = -1;
		}
		
		for (int i = 0; i < arr1.length; i++) {
			u1[arr1[i]] = arr1[i];
		}
		System.out.println(Arrays.toString(u1));

	}

}
