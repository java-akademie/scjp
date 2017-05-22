package ch.scjp.ch8.collections;

import java.util.Set;
import java.util.TreeSet;

public class Test1
{

	public static void main(String[] args)
	{

		Person1 p1 = new Person1(1, "hugo");
		Person1 p2 = new Person1(2, "max");
		Person1 p3 = new Person1(3, "moritz");
		Person1 p4 = new Person1(4, "fritz");
		Person1 p5 = new Person1(5, "franz");
		Person1 p6 = new Person1(6, "hans");
		Person1 p7 = new Person1(7, "urs");

		Set<Person1> l1 = new TreeSet<Person1>();

		System.out.println(l1.add(p1));
		System.out.println(l1.add(p2));
		System.out.println(l1.add(p3));
		System.out.println(l1.add(p4));
		System.out.println(l1.add(p5));
		System.out.println(l1.add(p6));
		System.out.println(l1.add(p7));

		for (Person1 p : l1)
		{
			System.out.println(p);
		}

	}

}
