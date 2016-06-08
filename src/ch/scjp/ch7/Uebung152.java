package ch.scjp.ch7;

public class Uebung152
{
	public static void main(String[] args) throws InterruptedException
	{
		for (int i = 0; i < 20000; i++)
		{
			new Uebung152();
		}
		System.out.println("ende");
	}


	int x, y, z;


	Uebung152() throws InterruptedException
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

		s3.start();
		s2.start();

		s3.join();
		s2.join();

		s1.start();

		s1.join();

		if (z != 0 && z != 1)
			;
		System.out.printf("%d %d %d \n", x, y, z);
	}

}
