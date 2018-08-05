package ch.scjp.ch8.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEntry
{
	static class Person
	{
		String name;


		Person(String name)
		{
			this.name = name;
		}


		@Override
		public String toString()
		{
			return "Person: " + name;
		}
	}

	static class Schluessel
	{
		int id;


		Schluessel(int id)
		{
			this.id = id;
		}


		@Override
		public String toString()
		{
			return "Schluessel: " + id;
		}
	}


	@SuppressWarnings({})
	public static void main(String[] args)
	{
		Map<Object, Person> m = new HashMap<Object, Person>();
		Schluessel s2 = new Schluessel(2);
		m.put(new Schluessel(1), new Person("name1"));
		m.put(s2, new Person("name21"));
		m.put(new Schluessel(3), new Person("name3"));
		m.put(2, new Person("name22"));
		m.put(new Schluessel(4), new Person("name4"));

		Set<?> s = m.entrySet();

		for (Iterator<?> i = s.iterator(); i.hasNext();)
		{
			@SuppressWarnings("rawtypes")
			Map.Entry o = (Map.Entry) i.next();
			System.out.println(o.getKey());
			System.out.println(o.getValue());
		}
	}
}
