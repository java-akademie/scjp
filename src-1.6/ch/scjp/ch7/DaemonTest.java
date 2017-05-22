package ch.scjp.ch7;

import ch.java_akademie.tools.MyTools;

public class DaemonTest
{
	public static void main(String[] args)
	{
		Thread th1 = new Thread()
		{
			@Override
			public void run()
			{
				Thread th2 = new Thread()
				{
					@Override
					public void run()
					{
						for (;;)
							System.out.println("unterthread");
					}
				};
				th2.setDaemon(true);
				System.out.println(th2.isDaemon());
				th2.start();
				for (;;)
					System.out.println("oberthread");

			}
		};
		th1.setDaemon(true);
		th1.start();
		MyTools.sleep(5000);
	}
}
