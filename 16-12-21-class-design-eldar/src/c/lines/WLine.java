package c.lines;

public class WLine extends Line {
	
	private int width;
	
	// CTOR
	public WLine(int length, int width) {
		super(length);
		this.width = width;
	}

	@Override
	public void print() {
		for (int i = 0; i < width; i++) {
			super.print();
		}
	}
	
	

}
