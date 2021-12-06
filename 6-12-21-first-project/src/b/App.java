package b;

public class App {

	public static void main(String[] args) {
		// create a number
		int x = 5;
		// create a Person object - based on the Person class
		Person p1 = new Person();
		p1.id = 101;
		p1.name = "Avi";
		p1.age = 22;
		// create a Person object
		Person p2 = new Person();
		p2.id = 102;
		p2.name = "Danna";
		p2.age = 18;
		// create a Person object
		Person p3 = new Person();
		p3.id = 103;
		p3.name = "Yuval";
		p3.age = 35;
		
		System.out.println(p3.id);
		System.out.println(p3.name);
		System.out.println(p3.age);
		
		p1.speak();
		p2.speak();
		p3.speak();
		
		
		

	}

}
