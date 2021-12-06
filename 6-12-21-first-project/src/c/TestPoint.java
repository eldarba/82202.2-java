package c;

public class TestPoint {

	public static void main(String[] args) {
		// create a point instance
		Point p1 = new Point();
		// print the point state
		p1.print();
		// move the point
		p1.moveRight();
		p1.moveRight();
		p1.moveDown();
		p1.moveDown();
		p1.moveDown();
		// print the point state again
		p1.print();
	}

}
