package ch.scjp.ch6.uebungen;

import ch.java_akademie.tools.MyTools;

class BaseClass
{
	double add(double i, double j)
	{
		return i + j;
	}


	void show()
	{
		System.out.println("base");
	}
}



class Lebewesen
{
	Lebewesen()
	{
		System.out.println("basisKonstruktor lebewesen");
	}


	Lebewesen(int i)
	{
		System.out.println("Konstruktor lebewesen ...i");
	}


	void show()
	{
		System.out.println("lebewesen");
	}
}



class Mensch extends Lebewesen
{
	Mensch(int x)
	{
		super(x);
		System.out.println("konstruktor mensch");
	}


	@Override
	void show()
	{
		System.out.println("mensch");
	}
}



class Pflanze extends Lebewesen
{
	Pflanze()
	{
		super(1);
	}


	@Override
	void show()
	{
		System.out.println("pflanze");
	}
}



class SubClass extends BaseClass
{
	int add(int i, int j)
	{
		return i + j;
	}


	@Override
	void show()
	{
		super.show();
		System.out.println("sub");
	}
}



class Tier extends Lebewesen
{
	@Override
	void show()
	{
		System.out.println("tier");
	}
}



public class Ueb604
{
	public static void main(String[] args)
	{
		System.out.println("                                  ");
		System.out.println("----------------------------------");
		System.out.println("Uebung 604: overloading/overriding");
		System.out.println("----------------------------------");
		System.out.println("                                  ");
		System.out.println("                                  ");
		testOverloading();
		testOverriding();
		System.out.println("----------------------------------");
		MyTools.pause();
	}


	static void testOverloading()
	{
		System.out.println("                                  ");
		System.out.println("----------------------------------");
		System.out.println("test overloading                  ");
		System.out.println("----------------------------------");
		SubClass s = new SubClass();
		int i = s.add(12, 12);
		System.out.println("i=" + i);
		double d = s.add(12.0, 12.0);
		System.out.println("d=" + d);

	}


	static void testOverriding()
	{
		System.out.println("                                  ");
		System.out.println("----------------------------------");
		System.out.println("test overriding                   ");
		System.out.println("----------------------------------");
		BaseClass b = new BaseClass();
		b.show();
		BaseClass s = new SubClass();
		s.show();
		Lebewesen l[];
		l = new Lebewesen[10];
		l[0] = new Mensch(1);
		l[1] = new Pflanze();
		l[2] = new Tier();
		l[3] = new Mensch(2);
		l[4] = new Pflanze();
		l[5] = new Tier();
		l[6] = new Mensch(3);
		l[7] = new Pflanze();
		l[8] = new Tier();
		l[9] = new Mensch(4);
		for (int i = 0; i < 10; i++)
		{
			l[i].show();
		}
	}
}
