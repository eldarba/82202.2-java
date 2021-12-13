package f.loops.breakAndcontinue;

public class Demo1 {
	
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if(i == 5) {
				break; // exit the loop
//				continue; // skip to next iteration
			}
			System.out.println(i);
		}
	}

}
