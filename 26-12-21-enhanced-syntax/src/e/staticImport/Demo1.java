package e.staticImport;

//for static members (variables, methods)
import static java.lang.Math.PI;
import static java.lang.Math.random;

import java.util.Date; // for classes, interfaces, enums (complex types)

public class Demo1 {
	
	public static void main(String[] args) {
		
		// static import: to use class members (static) without the class name
		System.out.println(PI);
		System.out.println(random());
		
		// import: to use class from other package without package name
		Date date;
	}

}
