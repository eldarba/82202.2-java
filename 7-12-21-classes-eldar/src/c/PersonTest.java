package c;

public class PersonTest {

	public static void main(String[] args) {
		
		// creating object using constructor 1
		Person p1 = new Person();
		
		// creating object using constructor 2
		Person p2 = new Person(111, "Avi", 32);
		
		// print the name of p2 using a get method:
		System.out.println(p2.getName());
		
		
	}

}
