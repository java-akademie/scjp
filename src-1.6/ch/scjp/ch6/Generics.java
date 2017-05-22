package ch.scjp.ch6;

import java.util.ArrayList;
import java.util.List;

public class Generics
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		AusgabeTool<Person> at = new AusgabeTool<Person>();

		at.print(new Person());

		List<Person> plist = new ArrayList<Person>();
		plist.add(new Person());

		for (Person p : plist)
		{
			p.show();
		}

	}
}



class Person
{
	void show()
	{
		System.out.println("person");
	}
}



class AdditionsTool<A, B>
{
	@SuppressWarnings("unused")
	void add(A a, B b)
	{
		Object o1 = a;
		Object o2 = b;
	}
}



class AusgabeTool<A>
{
	void print(A a)
	{
		System.out.println(a);
	}
}
