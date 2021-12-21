package d;

public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person();
		try {
			int age = (int) (Math.random()*201);
			p.setAge(age);
		}catch(PersonAgeException e) {
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}
		
		System.out.println(p.getAge());
		System.out.println("END");

	}

}
