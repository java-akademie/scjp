package ch.scjp.ch8.collections;

import java.util.Comparator;

public class NameComparator implements Comparator<Person2>
{

	@Override
	public int compare(Person2 o1, Person2 o2)
	{
		String v1 = o1.name + o1.id;
		String v2 = o2.name + o2.id;
		return v1.compareTo(v2);
	}

}
