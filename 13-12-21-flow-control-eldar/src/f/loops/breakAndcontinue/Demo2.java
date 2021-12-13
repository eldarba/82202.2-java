package f.loops.breakAndcontinue;

public class Demo2 {
	
	public static void main(String[] args) {
		outerLoop: for (int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				if(j == 5) {
					break outerLoop;
				}
				System.out.print(j + ", ");
			}
			System.out.println(); // line terminator
		}
	}

}
