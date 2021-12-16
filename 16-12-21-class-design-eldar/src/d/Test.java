package d;

public class Test {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.speak();
		
		Person s = new Singer();
		s.speak();
		
		Person t = new Talker();
		t.speak();

	}

}
