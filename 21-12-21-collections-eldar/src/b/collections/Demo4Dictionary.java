package b.collections;

import java.util.Collection;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Demo4Dictionary {

	public static void main(String[] args) {
		
		Map<String, String> map = new TreeMap<String, String>();
		map.put("dog", "an animal that barks");
//		map.put("dog", "כלב");
		map.put("java", "a programming language");
		map.put("pizza", "an italian tasty food");
		map.put("holiday", "a beautiful period in life");
		
		System.out.println(map);
		
		System.out.println("===============");
		
		// get all values
		Collection<String> values = map.values();
		for (String val : values) {
			System.out.println(val);
		}
		
		System.out.println("===============");
		// get all keys as set
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key);
		}
		
		System.out.println("===============");
		for (String key : map.keySet()) {
			System.out.println(key + ": " + map.get(key));
		}
		
		System.out.println("===============");
		Scanner sc = new Scanner(System.in);
		System.out.print("enter word: ");
		String key = sc.nextLine();
		if(map.containsKey(key)) {
			System.out.println("definition:");
			System.out.println(map.get(key));
		}else {
			System.out.println("sorry. " + key + " is not in dictionary");
		}
		
		sc.close();

	}

}
