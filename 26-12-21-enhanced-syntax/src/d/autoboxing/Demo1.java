package d.autoboxing;

public class Demo1 {

	public static void main(String[] args) {
		{
		int x = 5;
		Integer a = new Integer(x); // inbox
		Integer b = 3; // auto-inbox
		
		int y = a.intValue(); // outbox
		int z = b; // auto-outbox
		}
		
		//////////////////////
		{
			Double a = 5.3;
			double b = a;
			
			Character c1 = 'A';
			char c2 = c1;
			
		}
	}

}
