package d.scope;

public class Person {
	
	// attributes are global in the class
	// global variable are initialized automatically to default vlaues
	private int id;
	private String name;
	private int age;
	
	public int getId() {
		int id; // this id is local to this method - not initialized
		id = 10; // initialization
		System.out.println(id); // 10
		System.out.println(this.id); // the value of the Person.id
		return this.id;
	}
	
	public static void main(String[] args) {
		Person p = new Person();
		p.getId();
	}

}


