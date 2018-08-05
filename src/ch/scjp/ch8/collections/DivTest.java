package ch.scjp.ch8.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class AddrComparator implements Comparator<Person4>
{

	@Override
	public int compare(Person4 o1, Person4 o2)
	{
		String s1 = o1.addr + o1.id;
		String s2 = o2.addr + o2.id;
		return s1.compareToIgnoreCase(s2);
	}

}



public strictfp class DivTest
{

	public static void main(String[] args) throws Exception
	{

		Person4 p1 = new Person4(1, "ahoernchen", "bdorf");
		Person4 p2 = new Person4(2, "choernchen", "adorf");
		Person4 p3 = new Person4(3, "bhoernchen", "cdorf");

		Set<Person4> s = new TreeSet<Person4>(new AddrComparator());

		s.add(p1);
		s.add(p2);
		s.add(p3);

		for (Person4 p : s)
		{
			System.out.println(p);
		}
	}
}



class NameComparator2 implements Comparator<Person4>
{

	@Override
	public int compare(Person4 o1, Person4 o2)
	{
		String s1 = o1.name + o1.id;
		String s2 = o2.name + o2.id;
		return s1.compareToIgnoreCase(s2);
	}

}



class Person4 implements Comparable<Object>
{
	int id;
	String name;

	String addr;


	public Person4(int id, String name, String addr)
	{
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
	}


	@Override
	public int compareTo(Object o)
	{
		Person3 that = (Person3) o;
		return this.id - that.id;
	}


	@Override
	public String toString()
	{
		return "Person [id=" + id + ", name=" + name + ", addr=" + addr
				+ "]";
	}
}
