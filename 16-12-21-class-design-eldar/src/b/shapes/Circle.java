package b.shapes;

public class Circle extends Shape {

	private double radius;

	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	public Circle() {
		this("black", 1);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
//		return Math.PI * radius * radius;
		return Math.PI * Math.pow(radius, 2);
	}
	
	

}
