package ch.scjp.ch7;

/**
 * 
 * Uebung fuer Kapitel 7 - Threads
 * 
 */
public class Uebung74
{
	public static void main(String[] args) throws Exception
	{
		for (int i = 0; i < 10000; i++)
			new Uebung74();
	}
	int x;
	int y;

	int z;


	Object lock = new Object();


	Uebung74()
	{
		Thread s1 = new Thread()
		{
			@Override
			public void run()
			{
				synchronized (lock)
				{
					z = x + y;
				}
			}
		};

		Thread s2 = new Thread()
		{
			@Override
			public void run()
			{
				synchronized (lock)
				{
					x = 2;
					// for(int i=0; i<10000; i++){}
					y = 1;
				}
			}
		};

		s2.start();
		s1.start();

		try
		{
			s2.join();
			s1.join();
			// if (z==2)
			System.out.print("   " + x + "+" + y + "=" + z);
		}
		catch (Exception e)
		{
		}
	}
}
