package app.core;

public class Test {

	public static void main(String[] args) {

		Book book = new Book("B1-11-22-B", "Java Basic", "Eldar", 80);

		System.out.println(book.getTitle());
		System.out.println(book.getPrice());

		// =======================

		Rectangle r = new Rectangle(25, 10);
		r.print();
		System.out.println("area: ");
		System.out.println(r.getArea());
		System.out.println("perimeter: ");
		System.out.println(r.getPerimeter());

	}

}
