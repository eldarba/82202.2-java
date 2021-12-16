package a;

public class Test {
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "Dan";
		e.salary = 5500;
		
		
		String s = e.getDetails();
		System.out.println(e.getDetails());
		System.out.println(s);
		
		System.out.println("==========");
		
		Manager m = new Manager();
		m.name = "Danna";
		m.salary = 7800;
		m.department = "Legal";
		
		System.out.println(m.getDetails());
	}

}
