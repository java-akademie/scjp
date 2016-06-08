package ch.scjp.ch8.collections;

import java.util.Set;
import java.util.TreeSet;

public class Test2
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

		Set<Person2> l1 = new TreeSet<Person2>(new NameComparator());

		System.out.println(l1.add(p1));
		System.out.println(l1.add(p2));
		System.out.println(l1.add(p3));
		System.out.println(l1.add(p4));
		System.out.println(l1.add(p5));
		System.out.println(l1.add(p6));
		System.out.println(l1.add(p7));

		for (Person2 p : l1)
		{
			System.out.println(p);
		}

	}

}
