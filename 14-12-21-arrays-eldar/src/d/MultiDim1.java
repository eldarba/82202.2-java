package d;

public class MultiDim1 {

	public static void main(String[] args) {

		int[][] matrix = new int[4][3];
		matrix[0][0] = 5;
		matrix[3][2] = 3;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + ", ");
			}
			System.out.println();
		}

	}

}
