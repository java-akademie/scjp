package ch.scjp.ch7;

import ch.jmildner.tools.MyTools;

public class Thread1
{
	static void kurzlaeufer()
	{
		new Thread()
		{
			@Override
			public void run()
			{
				System.out.println("start kurzlaeufer");
				System.out.println("stopp kurzlaeufer");
			}
		}.start();
	}


	static void langlaeufer()
	{
		new Thread()
		{
			@Override
			public void run()
			{
				System.out.println("start langlaeufer");
				MyTools.sleep(3000); // 3 Sekunden
				System.out.println("stopp langlaeufer");
			}
		}.start();
	}


	public static void main(String[] args)
	{
		langlaeufer();

		kurzlaeufer();
		kurzlaeufer();
		kurzlaeufer();

		System.out.println("Programmende");
	}
}
