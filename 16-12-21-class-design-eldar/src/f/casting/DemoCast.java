package f.casting;

import b.shapes.Circle;
import b.shapes.Rectangle;
import b.shapes.Shape;

public class DemoCast {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[3];
		shapes[0] = new Shape();
		shapes[1] = new Rectangle(3, 6);
		shapes[2] = new Circle("RED", 2);
		
		for (int i = 0; i < shapes.length; i++) {
			Shape curr = shapes[i];
			System.out.println("area: " + curr.getArea());
			
			// lets check if the current shape is a Circle
			if(curr instanceof Circle) {
				Circle c = (Circle)curr; // explicit casting
				System.out.println("radius: " + c.getRadius());
			}
		}

	}

}
