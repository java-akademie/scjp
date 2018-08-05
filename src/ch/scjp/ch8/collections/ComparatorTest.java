package ch.scjp.ch8.collections;

import java.io.Console;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorTest
{


	public static void main(String[] args)
	{
		Person p1 = new Person(12, "hugo", "basel");
		Person p2 = new Person(22, "fritz", "zuerich");
		Person p3 = new Person(14, "anna", "genf");
		Person p4 = new Person(15, "luci", "zuerich");
		Person p5 = new Person(16, "luci", "st.gallen");

		Set<Person> personen = new TreeSet<Person>(
				new PersonenComparator());
		personen.add(p1);
		personen.add(p2);
		personen.add(p1);
		personen.add(p3);
		personen.add(p4);
		personen.add(p5);

		for (Person p : personen)
			p.show();

		
		
		
		Console c = System.console();
System.out.println(c);
		String name = c.readLine("bitte %s eingeben > ", "name");
		String addr = c.readLine("bitte %s eingeben > ", "addr");

		System.out.println(name + "/" + addr);

		char[] passwort = c.readPassword("bitte %s eingeben > ",
				"Passwort");

		System.out.println(passwort);

		c.readLine("***");
	}



}
