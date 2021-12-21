package d;

public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person();
		try {
			p.setAge(250);
			System.out.println(p.getAge());
		}catch(PersonAgeException e) {
			System.out.println(e.getMessage());
		}

	}

}
