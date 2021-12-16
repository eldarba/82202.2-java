package b.shapes;

public class Rectangle extends Shape {
	
	private double length;
	private double width;
	
	// CTOR 1
	public Rectangle(String color, double length, double width) {
		super(color); // invoke a super class CTOR
		this.length = length;
		this.width = width;
	}
	
	// CTOR 2
	public Rectangle(double length, double width) {
		this("Black", length, width); // invoke a CTOR in this class
	}
	
	
	// CTOR 3
	public Rectangle() {
		super();
	}
	
	@Override
	public double getArea() {
		return length * width;
	} 
	

}
