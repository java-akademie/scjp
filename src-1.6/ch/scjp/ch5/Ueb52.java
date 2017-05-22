package ch.scjp.ch5;

import ch.java_akademie.tools.MyTools;

class MeinFehler1 extends Exception
{
	private static final long serialVersionUID = 1L;


	MeinFehler1(String s)
	{
		super("Tag ist nicht numerisch: " + s);
	}
}



class MeinFehler11 extends MeinFehler1
{
	private static final long serialVersionUID = 1L;


	MeinFehler11(String s)
	{
		super("Tag ist nicht numerisch extends: " + s);
	}
}



class MeinFehler2 extends Exception
{
	private static final long serialVersionUID = 1L;


	MeinFehler2(String s)
	{
		super("Tag ist groesser 31 oder kleiner 1: " + s + "\n");
	}
}



class MyData
{
	String name;

	int tag;


	MyData()
	{
	}


	MyData(String n, String t) throws MeinFehler1, MeinFehler2
	{
		name = n;
		tag = -1;

		try
		{
			tag = Integer.parseInt(t);
			if (tag < 1 || tag > 31)
			{
				throw new MeinFehler2(t);
				// throw new Exception();
			}
		}
		catch (NumberFormatException e)
		{
			// tag=4711;
			throw new MeinFehler1(t);
		}
		finally
		{
			// tag=0; // sinnlos
			System.out.println("yyyyyyyyyyyyyyyyyyyyyyyyy");
			// show();
		}
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxx");
	}


	void show()
	{
		System.out.println("name=" + name);
		System.out.println("tag =" + tag);
	}


	void tce(String t) throws MeinFehler1
	{
		// test checked exeption
		try
		{
			int x = Integer.parseInt(t);
			if (x < 1 || x > 31)
			{
				throw new MeinFehler1(t);
				// throw new Exception();
			}
		}
		catch (NumberFormatException e)
		{
			// tag=4711;
			throw new MeinFehler1(t);
		}
		finally
		{
			// tag=0; // sinnlos
			System.out.println("yyyyyyyyyyyyyyyyyyyyyyyyy");
			// show();
		}
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxx");
	}
}



class MyData1 extends MyData
{
	MyData1()
	{
	}


	MyData1(String n, String t) throws Exception, NumberFormatException // MeinFehler1,
	// MeinFehler2
	{

		name = n;
		tag = -1;

		try
		{
			tag = Integer.parseInt(t);
			if (tag < 1 || tag > 31)
			{
				// throw new MeinFehler2(t);
				throw new Exception();
			}
		}
		// catch (NumberFormatException e)
		// {
		// tag=4711;
		// throw new MeinFehler1(t);
		// }
		finally
		{
			// tag=0; // sinnlos
			System.out.println("yyyyyyyyyyyyyyyyyyyyyyyyy");
			// show();
		}
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxx");
	}


	@Override
	void show()
	{
		System.out.println("name=" + name);
		System.out.println("tag =" + tag);
	}


	@Override
	void tce(String t) throws MeinFehler11
	{
		// test checked exeption
		try
		{
			int x = Integer.parseInt(t);
			if (x < 1 || x > 31)
			{
				throw new MeinFehler11(t);
				// throw new Exception();
			}
		}
		catch (NumberFormatException e)
		{
			// tag=4711;
			throw new MeinFehler11(t);
		}
		finally
		{
			// tag=0; // sinnlos
			System.out.println("yyyyyyyyyyyyyyyyyyyyyyyyy");
			// show();
		}
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxx");
	}
}



public class Ueb52
{

	public static void main(String[] args) throws MeinFehler1
	{
		new Ueb52();
	}


	MyData1 md2;


	Ueb52() throws MeinFehler1
	{
		test4();
		MyTools.pause();
		test3();
		MyTools.pause();
		test2();
		test1();
	}


	void test1()
	{
		int a = 1, b = 3, c = 2;

		moritz: for (;;)
		{
			while (true)
			{
				System.out.println("xx1");
				if (a == b)
					break;
				System.out.println("xx2");
				if (c == 2)
					break moritz;
				System.out.println("xx3");
				System.out.println("xx4");
			}

			System.out.println("xxxxxxxxxxxx");
		}

		if (a == b)
			;
		else
			System.out.println("yyyy");
	}


	void test2()
	{
		int x, y;
		double z[] = { 0, 0, 0, 0, 0 };
		for (int i = 1; i <= 100; i++)
		{
			x = (int) (Math.random() * 5);
			y = (int) (Math.random() * 6);
			boolean fehler = false;

			try
			{
				z[y] = z[y] + y / x;
			}
			/**/catch (ArithmeticException e)
			{
				fehler = true;
				System.out.println("Arithmetic problem: " + e);
			} /**/
			catch (ArrayIndexOutOfBoundsException e)
			{
				fehler = true;
				System.out.println("Subscript  problem: " + e);
			}
			catch (Exception e)
			{
				fehler = true;
				System.out.println(e);
			}
			finally
			{
				if (fehler)
				{
					System.out.println("finally");
				}
				fehler = false;
			}
		}

		for (int i = 0; i < 5; i++)
		{
			System.out.println(z[i]);
		}

	}


	void test3() throws MeinFehler1
	{
		try
		{
			md2 = new MyData1("name", "a999");
			md2.show();
		}
		// catch (MeinFehler1 e)
		// {
		// System.out.println(e);
		// }
		catch (MeinFehler2 e)
		{
			System.out.println(e);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		// catch (Exception e)
		// {
		// System.out.println(e + "aaaaaaaaaaaaaaaaa");
		// }

	}


	void test4() throws MeinFehler1
	{
		MyData1 md = new MyData1();
		md.tce("s");
	}

}
