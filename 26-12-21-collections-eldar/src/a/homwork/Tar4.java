package a.homwork;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Tar4 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("Dan");
		set.add("Ran");
		set.add("Lea");
		
		System.out.println(set);
		Iterator<String> it = set.iterator();
		it.next();
		it.next();
		System.out.println(it.next());
		
	}

}
