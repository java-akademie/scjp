package ch.scjp.ch8.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

import ch.jmildner.tools.MyTools;

/**
 * 08. Mai 2006
 * 
 * @author johann
 * 
 */
public class TestTeilnehmer2
{
	public static void main(String[] args)
	{
		new TestTeilnehmer2();
	}


	Teilnehmer[] teilnehmer;


	TestTeilnehmer2()
	{
		init(8);

		doTestArray();

		doTestListen();
		doTestSets();
		doTestMaps();
	}


	void ausgeben(List<Teilnehmer> c)
	{
		Iterator<Teilnehmer> i = c.iterator();

		while (i.hasNext())
		{
			Object o = i.next();
			System.out.println(o);
		}
	}


	void ausgeben(Map<Integer, Teilnehmer> c)
	{
		Set<Integer> keys = c.keySet();

		Iterator<Integer> i = keys.iterator();
		while (i.hasNext())
		{
			Object o = i.next();
			System.out.println(o + " = " + c.get(o).getName());
		}
	}


	void ausgeben(Set<Teilnehmer> c)
	{
		Iterator<Teilnehmer> i = c.iterator();

		while (i.hasNext())
		{
			Object o = i.next();
			System.out.println(o);
		}
	}


	void doTestArray()
	{
		System.out.println("\n\nArray - vor Arrays.sort() ");

		for (int i = 0; i < teilnehmer.length; i++)
		{
			System.out.println(teilnehmer[i]);
		}

		System.out.println();

		Arrays.sort(teilnehmer);

		System.out.println("\n\nArray - nach Arrays.sort() ");

		for (int i = 0; i < teilnehmer.length; i++)
		{
			System.out.println(teilnehmer[i]);
		}

	}


	void doTestListen()
	{
		System.out.println("\n\nListen - "
				+ "geordnete Menge von Objekten \n"
				+ "unsortiert, doppelte Elemente sind erlaubt");

		List<Teilnehmer> v = new Vector<Teilnehmer>();
		test(v, "Vector");

		List<Teilnehmer> a = new ArrayList<Teilnehmer>();
		test(a, "ArrayList");

		List<Teilnehmer> l = new LinkedList<Teilnehmer>();
		test(l, "LinkedList");
	}


	void doTestMaps()
	{
		System.out.println("\n\nMaps - "
				+ "ungeordnete Menge von Schluesselwertpaaren \n"
				+ "doppelte Elemente sind nicht erlaubt \n"
				+ "Hashtable, HashMap sind unsortiert, "
				+ "TreeMap ist sortiert ");

		Map<Integer, Teilnehmer> ht = new Hashtable<Integer, Teilnehmer>();
		test(ht, "Hashtable");

		Map<Integer, Teilnehmer> hm = new HashMap<Integer, Teilnehmer>();
		test(hm, "HashMap");

		Map<Integer, Teilnehmer> tm = new TreeMap<Integer, Teilnehmer>();
		test(tm, "TreeMap");
	}


	void doTestSets()
	{
		System.out.println("\n\nSets - "
				+ "ungeordnete Menge von Objekten \n"
				+ "doppelte Elemente sind nicht erlaubt \n"
				+ "HashSet ist unsortiert, TreeSet ist sortiert ");

		Set<Teilnehmer> h = new HashSet<Teilnehmer>();
		test(h, "HashSet");

		Set<Teilnehmer> t = new TreeSet<Teilnehmer>();
		test(t, "TreeSet");
	}



	void init(int max)
	{
		teilnehmer = new Teilnehmer[max];
		for (int i = 0; i < teilnehmer.length; i++)
		{
			int id = MyTools.getRandom(1001, 1000 + max / 2);
			teilnehmer[i] = new Teilnehmer(id, "name." + id, "meier");
		}
	}



	void test(List<Teilnehmer> c, String x)
	{
		System.out.println("\n--- " + x);
		for (int i = 0; i < teilnehmer.length; i++)
		{
			c.add(teilnehmer[i]);
		}
		System.out.println();
		ausgeben(c);
	}



	void test(Map<Integer, Teilnehmer> c, String x)
	{
		System.out.println("\n--- " + x);
		for (int i = 0; i < teilnehmer.length; i++)
		{
			c.put(new Integer(teilnehmer[i].getId()), teilnehmer[i]);
		}
		System.out.println();
		ausgeben(c);
	}


	void test(Set<Teilnehmer> c, String x)
	{
		System.out.println("\n--- " + x);
		for (int i = 0; i < teilnehmer.length; i++)
		{
			c.add(teilnehmer[i]);
		}
		System.out.println();
		ausgeben(c);
	}

}
