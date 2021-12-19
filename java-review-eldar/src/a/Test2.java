package a;

public class Test2 {

	public static void main(String[] args) {

		int r = (int) (Math.random() * 81) + 20; // 20 - 100

		Shape[] shapes = new Shape[r];

		for (int i = 0; i < shapes.length; i++) {
			String color = Shape.COLORS[(int) (Math.random() * Shape.COLORS.length)];
			if (Math.random() < 0.5) {
				int length = (int) (Math.random() * 26);
				int width = (int) (Math.random() * 26);
				shapes[i] = new Rectangle(color, length, width);
			} else {
				int radius = (int) (Math.random() * 11);
				shapes[i] = new Circle(color, radius);
			}
		}

		// print all shapes
		for (int i = 0; i < shapes.length; i++) {
			System.out.println(shapes[i] + " Area: " + shapes[i].getArea());
		}

		System.out.println("number of shapes created: " + Shape.getNumberOfShapes());

	}

}
