package ch.scjp.ch7;

import ch.java_akademie.tools.MyTools;

public class Uebung141
{

	class AbbruchThread extends Thread
	{

		Thread th1;
		Thread th2;



		public AbbruchThread(Thread th1, Thread th2)
		{
			super();
			this.th1 = th1;
			this.th2 = th2;
		}



		@Override
		public void run()
		{
			MyTools.sleep(10);
			th1.interrupt();
			MyTools.sleep(10);
			th2.interrupt();
		}
	}


	class InnerThread extends Thread
	{
		private int id;
		private int zaehler;


		public InnerThread(int id)
		{

			this.id = id;
		}


		@Override
		public void run()
		{
			for (;;)
			{
				if (isInterrupted())
				{
					break;
				}
				zaehler++;
				System.out.println(id + " " + zaehler);
			}
		}
	}


	public static void main(String[] args) throws InterruptedException
	{
		new Uebung141();
		System.out.println("stopp ...............");
	}


	Uebung141() throws InterruptedException
	{
		InnerThread ith1 = new InnerThread(1);
		InnerThread ith2 = new InnerThread(2);
		AbbruchThread th3 = new AbbruchThread(ith1, ith2);
		th3.start();
		ith1.start();
		ith2.start();
		ith1.join();
		ith2.join();
	}
}
