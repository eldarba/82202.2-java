package c.shapes;

public class Rectangle extends Shape {

	private int lengt;
	private int width;

	@Override
	public int getArea() {
		return lengt * width;
	}

}
