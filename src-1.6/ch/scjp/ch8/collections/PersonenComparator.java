package ch.scjp.ch8.collections;

import java.util.Comparator;

public class PersonenComparator implements Comparator<Person>
{

	@Override
	public int compare(Person o1, Person o2)
	{
		String a = o1.getAddr() + o1.getId();
		String b = o2.getAddr() + o2.getId();
		return a.compareTo(b);
	}

}
