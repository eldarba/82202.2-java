package c.lines;

public class Test1 {

	public static void main(String[] args) {
		Line line = new Line(5);
		System.out.println(line.getLength());
		line.print();
		
		line.setLength(15);
		System.out.println(line.getLength());
		line.print();

	}

}
