package d;

public class MultiDim2 {

	public static void main(String[] args) {
		// static initialization of 2 dimensional array
		int[][] matrix = { { 1, 1, 1 }, { 2, 2 }, { 3, 3, 3, 3 } };
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("=============");
		System.out.println("=============");
		System.out.println("=============");
	}

}
