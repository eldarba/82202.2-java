package c;

import b.Box;

public class Demo1StaticInit {

	public static void main(String[] args) {
		
		// arrays can be dynamically initialized
		int[] arr = new int[3];
		arr[0] = 2;
		arr[1] = 4;
		arr[2] = 8;
		
		// arrays can be statically initialized
		int[] arr1 = { 2, 4, 8 };

		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

		System.out.println("=============");
		String[] names = { "Dinna", "Yosi", "Arie", "Mira" };
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		System.out.println("=============");
		Box[] boxes = {new Box(), new Box(1, 2, 1)};
		System.out.println(boxes.length);
	}

}
