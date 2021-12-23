package a.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Demo1 {
	
	public static void main(String[] args) {
		
		// List - ordered + has duplicates
		List<String> list1 = new ArrayList<String>(); // random access
		List<String> list2 = new LinkedList<String>(); // add + remove
		list1.add("ccc");
		list1.add("bbb");
		list1.add("aaa");
		list1.add("bbb");
		System.out.println(list1);
		
		// Set - no duplicates + not always ordered 
		Set<String> set1 = new HashSet<String>(list1); // hashcode order
		System.out.println(set1);
		
		Set<String> set2 = new LinkedHashSet<String>(list1); // insert order
		System.out.println(set2);
		
		Set<String> set3 = new TreeSet<String>(list1); // sorted
		System.out.println(set3);
		
		
		
		
	}

}
