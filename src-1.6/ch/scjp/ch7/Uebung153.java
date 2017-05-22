package ch.scjp.ch7;

public class Uebung153
{
	public static void main(String[] args) throws InterruptedException
	{
		for (int i = 0; i < 2000; i++)
		{
			new Uebung153();
		}
		System.out.println("ende");
	}
	int x, y, z;


	Object schluessel = new Object();


	Uebung153() throws InterruptedException
	{
		Thread s1 = new Thread()
		{
			@Override
			public void run()
			{
				synchronized (schluessel)
				{
					while (x == 0 || y == 0)
					{
						try
						{
							schluessel.wait();
						}
						catch (InterruptedException e)
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
				synchronized (schluessel)
				{
					x = 1;
					schluessel.notify();
				}
			}
		};
		Thread s3 = new Thread()
		{
			@Override
			public void run()
			{
				synchronized (schluessel)
				{
					y = 2;
					schluessel.notify();
				}
			}
		};

		s3.start();
		s2.start();
		s1.start();

		if (z != 0)
			;

		s1.join();

		System.out.printf("%d %d %d \n", x, y, z);
	}

}
