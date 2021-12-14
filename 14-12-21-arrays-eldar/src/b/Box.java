package b;

public class Box {
	// attributes
	private int length;
	private int width;
	private int height;
	
	// CTOR 1
	public Box() {
	}

	// CTOR 2
	public Box(int length, int width, int height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	}

	// getters and setters
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

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	

}
