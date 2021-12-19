package c;

public class TestPerson {

	public static void main(String[] args) {
		System.out.println("start");
		System.out.println("counter: " + Person.getCounter()); // static reference
		Person p1 = new Person("aaa", 25);
		Person p2 = new Person("bbb", 55);
		Person p3 = new Person("ccc", 22);
		
//		Person.counter = -500;
		System.out.println("counter: " + Person.getCounter()); // static reference
		System.out.println("id: " + p2.id); // dynamic reference
		System.out.println("name: " + p2.getName()); // dynamic reference
		
//		p2.id = 111;
		System.out.println(Math.PI);
		

	}

}
