package b;

import a.Machine;

public class OtherClass {
	
	public static void main(String[] args) {
		Machine m = new Machine();
		// dynamic reference
		double x = m.addD(4, 3.5);
		System.out.println(x);
		
		// static reference
		double y = Machine.addS(5.3, 9.4);
		System.out.println(y);
	}

}
