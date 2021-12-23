package a.collections;

import java.util.LinkedList;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {
		
//		List<Integer> list = new ArrayList()<Integer>(); // poor performance
		List<Integer> list = new LinkedList<Integer>();
		
		long ts1 = System.currentTimeMillis();
		for (int i = 0; i < 100_000; i++) {
			int r = (int) (Math.random()*1001);
			list.add(0, r);// Inserts to the specified position 
		}
		long ts2 = System.currentTimeMillis();
		
		System.out.println(ts2-ts1 + " ms");

	}

}
