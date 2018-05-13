package ch.scjp.ch8.collections;

import ch.jmildner.tools.MyTools;

/**
 * 08. Mai 2006
 * 
 * @author johann
 * 
 */
public class TestTeilnehmer1
{
	public static void main(String[] args)
	{
		new TestTeilnehmer2();
	}


	Teilnehmer[] teilnehmer;


	TestTeilnehmer1()
	{
		init(10);
		test1();
	}


	void init(int max)
	{
		teilnehmer = new Teilnehmer[max];
		for (int i = 0; i < teilnehmer.length; i++)
		{
			int id = MyTools.getRandom(1001, 1000 + max);
			teilnehmer[i] = new Teilnehmer(id, "name." + id, "meier");
		}
	}


	void test1()
	{
		Teilnehmer t1 = new Teilnehmer(1, "meier", "meier");
		Teilnehmer t2 = new Teilnehmer(1, "gruber", "meier");

		System.out.println(t1.equals(t2));
		System.out.println(t1.compareTo(t2));
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(t1);
		System.out.println(t2);
		t1.show();
		t2.show();
	}

}
