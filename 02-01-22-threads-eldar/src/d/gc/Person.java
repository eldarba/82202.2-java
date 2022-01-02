package d.gc;

public class Person {
	
	private static int numberOfInstancesInMemory;
	private int id;
	private String name;
	
	// initializer
	{ // runs on object creation
		numberOfInstancesInMemory++;
		this.id = numberOfInstancesInMemory;
	}
	
	
	
	public Person(String name) {
		super();
		this.name = name;
	}



	// this method is called by GC before recycling this object 
	@Override
	protected void finalize() throws Throwable {
		System.out.println(name + " is finalized");
		numberOfInstancesInMemory--;
	}



	public static int getNumberOfInstancesInMemory() {
		return numberOfInstancesInMemory;
	}



	
	
	
	
	
	
	

}
