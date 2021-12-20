package d.enums;

public class Test {

	public static void main(String[] args) {
		Color cl = Color.GREEN;
		System.out.println(cl);
		System.out.println(cl.ordinal());
		System.out.println("=============");
		
		Color[] colors = Color.values();
		for (Color color : colors) {
			System.out.println(color);
		}

	}

}
