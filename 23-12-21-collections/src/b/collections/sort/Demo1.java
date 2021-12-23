package b.collections.sort;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		{
			List<Person> list = new ArrayList<>();
			list.add(new Person(105, "ccc", 36));
			list.add(new Person(101, "ddd", 22));
			list.add(new Person(107, "bbb", 11));
			list.add(new Person(103, "aaa", 53));
			System.out.println(list); // print
			list.sort(null); // sort
			System.out.println(list); // print again
		}

		{
			List<Integer> list = new ArrayList<Integer>();
			list.add(8);
			list.add(5);
			list.add(1);
			list.add(7);
			list.add(5);
			System.out.println(list);
			list.sort(null);
			System.out.println(list);
		}

		{
			List<LocalDate> list = new ArrayList<>();
			list.add(LocalDate.of(1980, 12, 20));
			list.add(LocalDate.of(2021, 12, 20));
			list.add(LocalDate.now());
			list.add(LocalDate.of(1980, 12, 20));
			list.add(LocalDate.of(1600, 12, 20));
			System.out.println(list);
			list.sort(null);
			System.out.println(list);
		}

	}

}
