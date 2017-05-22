package ch.scjp.ch8.collections;


import java.util.LinkedList;
import java.util.List;


public class GenericTest
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		LinkedList<? extends Object> lls = new LinkedList<String>();
		// lls.add((Object)"hugo");
		LinkedList<Person3> llp = new LinkedList<Person3>();
		llp.add(new Person3(4711, "hugo"));

		GenericTest g = new GenericTest();
		g.auslesen(lls);
		g.auslesen(llp);
		lls = llp;
		g.auslesen(lls);
	}


	StringBuffer sb;


	private void auslesen(List<?> lls)
	{
		for (Object s : lls)
		{
			System.out.println(s.toString());
		}

	}

}
