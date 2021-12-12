package d.scope;

public class Demo1 {

	public static void main(String[] args) {
		
		{ // this is a scope 
			int x = 5; // local variable of this scope
			System.out.println(x);
		}// end of scope
		
		{ // this is a scope 
			int x = 2;
			System.out.println(x);
		}// end of scope

	}

}
