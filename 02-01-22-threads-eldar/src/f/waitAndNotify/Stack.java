package f.waitAndNotify;

import java.util.ArrayList;
import java.util.List;

public class Stack {

	private List<Integer> list = new ArrayList<Integer>();
	public static final int MAX = 10;

	// push - add an element to a stack
	public synchronized void push(Integer val) {
		while (list.size() == MAX) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		list.add(val); // add an element to the end of the list
		System.out.println(list);
		notify();
	}

	// pop - take an element out of a stack
	public synchronized Integer pop() {
		while (list.isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		int index = list.size()-1;
		int val = list.remove(index);
		System.out.println(list);
		notify();
		return val;
	}

}
