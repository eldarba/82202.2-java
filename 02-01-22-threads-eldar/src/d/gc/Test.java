package d.gc;

public class Test {

	public static void main(String[] args) {
		Person p1 = new Person("aaa");
		Person p2 = new Person("bbb");
		Person p3 = new Person("ccc");
		
		System.out.println("number of instances: " + Person.getNumberOfInstancesInMemory());
		
		p2 = null;
		System.gc(); // ask GC to start a cycle
		System.out.println("number of instances: " + Person.getNumberOfInstancesInMemory());

	}

}
