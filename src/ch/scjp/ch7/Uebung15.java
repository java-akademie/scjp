package ch.scjp.ch7;

/**
 * 
 * Uebung fuer Kapitel 7 - Threads
 * 
 */
public class Uebung15
{
	static int[] ergebnis = new int[4];


	public static void main(String[] args) throws Exception
	{
		for (int i = 0; i < 2000; i++)
		{
			new Uebung15();
		}

		System.out.println();

		System.out.printf("1+2=0  %5d\n", ergebnis[0]);
		System.out.printf("1+2=1  %5d\n", ergebnis[1]);
		System.out.printf("1+2=2  %5d\n", ergebnis[2]);
		System.out.printf("1+2=3  %5d\n", ergebnis[3]);
	}
	int x;
	int y;


	int z;


	Uebung15()
	{
		Thread s1 = new Thread()
		{
			@Override
			public void run()
			{
				z = x + y;
			}
		};

		Thread s2 = new Thread()
		{
			@Override
			public void run()
			{
				x = 1;
			}
		};

		Thread s3 = new Thread()
		{
			@Override
			public void run()
			{
				y = 2;
			}
		};

		s2.start();
		s3.start();

		try
		{
			s2.join();
			s3.join();
		}
		catch (Exception e)
		{
		}

		s1.start();

		try
		{
			s1.join();

			ergebnis[z]++;
			if (x != 1 && y != 2)
				System.out.print("   " + x + "+" + y + "=" + z);
		}
		catch (Exception e)
		{
		}


	}
}
