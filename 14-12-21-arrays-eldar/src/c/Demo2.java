package c;

public class Demo2 {

	public static void main(String[] args) {//

		String[] modes = { "ON", "OFF", "STAND_BY", "SLEEP" };

		int index = (int) (Math.random() * modes.length);
		System.out.println(modes[index]);
		

	}

}
