package b.forEach;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Demo2 {

	public static void main(String[] args) {

		Set<Integer> set = new LinkedHashSet<>();
		set.add(2);
		set.add(4);
		set.add(5);
		set.add(6);
		set.add(7);
		set.add(8);

		// iterator
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			int x = it.next();
			System.out.println(x);
//			if(x%2==0) {
//				it.remove();
//			}
		}
		System.out.println(set);

		System.out.println("================");
		// for each loop
		for (int x : set) {
			System.out.println(x);
		}

		// for elements removal during loop iteration use Iterator
		
	}

}
