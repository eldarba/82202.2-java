package app.core;

public class Rectangle {
	
	private int length;
	private int width;
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getArea() {
		return length * width;
	}
	
	public int getPerimeter() {
		return 2 * (length + width);
	}
	
	public void print() {
		System.out.print("Rectangle [length: ");
		System.out.print(length);
		System.out.print(", width: ");
		System.out.print(width);
		System.out.println("]");
	}

}
