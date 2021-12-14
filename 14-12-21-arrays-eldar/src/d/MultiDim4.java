package d;

public class MultiDim4 {

	public static void main(String[] args) {

		int[][] arr = new int[5][];
		arr[0] = new int[10];
		arr[1] = new int[2];
		arr[2] = new int[5];
		arr[3] = new int[7];
		arr[4] = new int[3];

		// populate with random numbers (0-100)
		for (int row = 0; row < arr.length; row++) {
			for (int column = 0; column < arr[row].length; column++) {
				arr[row][column] = (int) (Math.random() * 101);
				System.out.print(arr[row][column] + ", ");
			}
			System.out.println();
		}
	}

}
