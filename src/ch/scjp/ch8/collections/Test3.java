package ch.scjp.ch8.collections;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test3
{

	public static void main(String[] args)
	{

		Person2 p1 = new Person2(1, "hugo", "basel");
		Person2 p2 = new Person2(2, "max", "olten");
		Person2 p3 = new Person2(3, "moritz", "bern");
		Person2 p4 = new Person2(4, "fritz", "genf");
		Person2 p5 = new Person2(5, "franz", "basel");
		Person2 p6 = new Person2(6, "hans", "genf");
		Person2 p7 = new Person2(7, "urs", "bern");

		Map<Person2, Person2> l1 = new TreeMap<Person2, Person2>(
				new NameComparator());

		System.out.println(l1.put(p2, p2));
		System.out.println(l1.put(p3, p3));
		System.out.println(l1.put(p4, p4));
		System.out.println(l1.put(p5, p5));
		System.out.println(l1.put(p6, p6));
		System.out.println(l1.put(p7, p7));
		System.out.println(l1.put(p1, p1));

		Set<Person2> k = l1.keySet();

		for (Person2 i : k)
		{
			Person2 p = l1.get(i);
			System.out.println(p);
		}

	}

}
