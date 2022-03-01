package a;

public class Person {
	
	public void speak() {
		System.out.println("speaks like a person");
	}
	
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.speak();
		
		Person pManager = new Person() {
				
				@Override
				public void speak() {
					System.out.println("speaks like a manager");
				}
				
		};
		pManager.speak();
		
		
	}

}
