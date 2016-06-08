package ch.scjp.ch5;

public class Ueb51
{
	class MyException extends Exception
	{
		private static final long serialVersionUID = 1L;


		MyException(String s)
		{
			super(s);
		}
	}


	public static void main(String[] args) throws MyException
	{
		new Ueb51();
	}


	Ueb51() throws MyException
	{
		test3(99L);
		test2(4, 0);
		test1();
	}


	void test1()
	{
		int x = 2;

		switch (x)
		{
			case 1:
			{
				System.out.println("1");
				break;
			}

			case 2:
			{
				System.out.println("2");
				break;
			}

			default:
			{
				System.out.println("default");
				break;
			}
		}
	}


	void test2(int i, int j)
	{
		assert (j >= 0) : "der divisor muss groesser null sein: " + j;
		try
		{
			System.out.println(i + "/" + j + "=" + i / j);
		}
		catch (Exception e)
		{
			try
			{
				throw new MyException("meinFehler");
			}
			catch (MyException e1)
			{
				e1.printStackTrace();
			}
		}
		finally
		{
			System.out.println("ende Test2 im finally block");

		}
		System.out.println("ende Test2");
	}


	void test3(long i)
	{
		switch ((int) i)
		{
			case 99:
				System.out.println(i);
		}
	}

}
