package ch.scjp.ch8.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


public class CollectionTest
{

	public static void main(String[] args)
	{
		setTest();
		mapTest();
	}



	private static void mapTest()
	{
		Map<Schluessel, Person3> m = new HashMap<Schluessel, Person3>();

		m.put(new Schluessel(4), new Person3(4, "name-4"));
		m.put(new Schluessel(0), new Person3(0, "name-0"));
		m.put(new Schluessel(2), new Person3(2, "name-2"));
		m.put(new Schluessel(2), new Person3(2, "name-2"));
		m.put(new Schluessel(1), new Person3(1, "name-1"));



		Set<?> es = m.entrySet();

		for (Iterator<?> ies = es.iterator(); ies.hasNext();)
		{
			@SuppressWarnings("rawtypes")
			Map.Entry o = (Map.Entry) ies.next();
			System.out.println(o.getKey());
			System.out.println(o.getValue());
		}
	}


	private static void setTest()
	{
		Set<Person3> s = new TreeSet<Person3>();
		s.add(new Person3(1, "name-1"));
		s.add(new Person3(2, "name-2"));
		s.add(new Person3(4, "name-4"));
		s.add(new Person3(5, "name-5"));
		s.add(new Person3(7, "name-7"));
		s.add(new Person3(5, "name-5"));
		s.add(new Person3(6, "name-6"));
		s.add(new Person3(0, "name-0"));
		s.add(new Person3(3, "name-3"));

		for (Iterator<Person3> i = s.iterator(); i.hasNext();)
		{
			Person3 p = i.next();
			System.out.println(p);
		}

	}

}
