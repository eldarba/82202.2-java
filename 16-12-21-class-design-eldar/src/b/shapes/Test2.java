package b.shapes;

public class Test2 {

	public static void main(String[] args) {
		
		Shape s1 = new Shape();
		Shape s2 = new Shape("Yellow");
		
		System.out.println(s1.getColor());
		System.out.println(s2.getColor());
		
		
		s1.setColor("Gray");
		s2.setColor("White");

		System.out.println(s1.getColor());
		System.out.println(s2.getColor());

	}

}
