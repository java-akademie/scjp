package ch.scjp.ch7;

/**
 * 
 * Uebung fuer Kapitel 7 - Threads
 * 
 */
public class Uebung75
{
	public static void main(String[] args) throws Exception
	{
		for (int i = 0; i < 10; i++)
		{
			new Uebung75();
		}
	}

	Object lock = new Object();
	int x;
	int y;


	int z;


	Uebung75()
	{
		Thread s1 = new Thread()
		{
			@Override
			public void run()
			{
				synchronized (lock)
				{
					while (x == 0 || y == 0)
					{
						try
						{
							lock.wait();
						}
						catch (Exception e)
						{
						}
					}
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
					x = 1;
					// for(int i=0; i<10000; i++){}
					y = 2;

					lock.notify();
				}
			}
		};

		s1.start();
		s2.start();

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
