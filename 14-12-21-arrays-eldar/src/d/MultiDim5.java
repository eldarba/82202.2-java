package d;

public class MultiDim5 {

	public static void main(String[] args) {
		
		String[][] cinema = new String[3][3];
		print(cinema);
		cinema[0][0] = "Moshe";
		cinema[0][1] = "Dan";
		cinema[0][2] = "Sarrah";
		cinema[2][1] = "Moshe";
		print(cinema);
		
	}
	
	public static void print(String[][] cinema) {
		System.out.println("=========================");
		for (int i = 0; i < cinema.length; i++) {
			for (int j = 0; j < cinema[i].length; j++) {
				System.out.print(cinema[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("=========================");
	}

}
