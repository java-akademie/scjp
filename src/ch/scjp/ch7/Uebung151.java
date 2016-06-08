package ch.scjp.ch7;

public class Uebung151
{

	public static void main(String[] args) throws InterruptedException
	{
		for (int i = 1; i <= 100; i++)
		{
			new Uebung151(i);
		}
	}

	int x, y, z;


	Object schluessel = new Object();


	Uebung151(int id) throws InterruptedException
	{

		Thread s1 = new Thread()
		{
			@Override
			public void run()
			{
				synchronized (schluessel)
				{
					if (x == 0 || y == 0)
					{
						try
						{
							schluessel.wait();
						}
						catch (InterruptedException e)
						{
							e.printStackTrace();
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
					y = 2;
					schluessel.notify();
				}
			}
		};



		s1.start();
		s2.start();

		s1.join();
		s2.join();

		if (z != 0)
			System.out.println(id + ":" + z);

	}

}
