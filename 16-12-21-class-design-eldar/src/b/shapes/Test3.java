package b.shapes;

public class Test3 {

	public static void main(String[] args) {
		
		Shape shape; // declare a reference of type Shape
		
		// assign the reference a Rectangle object
		shape = new Rectangle("Red", 5, 8);
		System.out.println(shape.getArea());
		
		shape = new Circle("Green", 3);
		System.out.println(shape.getArea());
		 //////////////////////////////////////////////////////
		
		int x;
		x = 5;
		System.out.println(x);
		
		x = 12;
		System.out.println(x);
	}

}
