package c;

public class IfDemo3 {

	public static void main(String[] args) {

		int grade = (int) (Math.random() * 101);
		grade = 80;
		System.out.println(grade);

		if (grade < 60) {
			System.out.println("fail");
		} else if (grade < 70) {
			System.out.println("pass");
		} else if (grade < 90) {
			System.out.println("good");
		} else {
			System.out.println("great");
		}
		
		System.out.println("========");

	}

}
