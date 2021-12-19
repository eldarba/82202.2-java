package c;

public class Person {
	
	// fields

	// instance variables
	public final int id; // final cannot be reassigned
	private String name;
	private int age;
	// class variables
	private static int counter;
	// constant (static + final)
	public static final int MAX_AGE = 120;

	static { // static initializer - runs on class load - only once
		if (Math.random() < 0.5) {
			counter = 100;
		} else {
			counter = 1000;
		}
		System.out.println("class loaded - counter set to " + counter);
	}

	{ // initializer - runs on object creation before CTOR
		System.out.println("person created");
		counter++;
		this.id = counter; // id is assigned and locked on this value
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		setAge(age);
	}

	public Person() {
	}

	// class method (static)
	public static int getCounter() {
		return counter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age <= MAX_AGE) {
			this.age = age;
		}
	}

}
