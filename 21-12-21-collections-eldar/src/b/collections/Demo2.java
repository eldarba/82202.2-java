package b.collections;

import java.util.HashSet;
import java.util.Set;

public class Demo2 {
	
	public static void main(String[] args) {
		// create a list
		Set<String> set = new HashSet<String>();
		// print list size (number of elements)
		System.out.println("size: " + set.size());
		// add elements to list:
		set.add("hello");
		set.add("java");
		set.add("world");
		set.add("java");
		set.add("hello");
		// print the list
		System.out.println(set);
		System.out.println("size: " + set.size());
//		System.out.println(set.get(2)); // get element by index
	}

}
