package b.collections.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {
		
		List<Person> list = new ArrayList<>();
		list.add(new Person(105, "ccc", 36));
		list.add(new Person(101, "ddd", 22));
		list.add(new Person(107, "bbb", 11));
		list.add(new Person(103, "aaa", 53));
		
		System.out.println("insert order");
		System.out.println(list); // print
		
		System.out.println("natural order");
		list.sort(null); // sort
//		Collections.sort(list);
		System.out.println(list); // print again
		
		System.out.println("other order - name");
		PersonNameComparator nameComparator = new PersonNameComparator();
		list.sort(nameComparator); // sort
		System.out.println(list); // print again

		System.out.println("other order - age");
		list.sort(new PersonAgeComparator()); // sort
		System.out.println(list); // print again
		
		
		
		
		

	}

}
