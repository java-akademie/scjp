/**
 *	Vorbereitung fuer scjp Donnestag 26.01.2006
 *  Threads
 */
package ch.scjp.ch7;

import ch.java_akademie.tools.MyTools;

class MyRunnable implements Runnable
{

	@Override
	public void run()
	{
		System.out.println("yyy");
	}
}



class MyThread extends Thread
{
	@Override
	public void run()
	{
		while (true)
		{
			System.out.println("xxx " + this.getPriority());
			if (this.isInterrupted())
			{
				System.out.println("flag immer noch gesetzt");
				if (Thread.interrupted())
				{
					break;
				}
				MyTools.pause();
			}
			else
			{
				System.out.println("flag nicht gesetzt");
			}
		}

	}
}



public class Test2
{
	public static void main(String[] args)
	{
		MyThread mt = new MyThread();
		mt.setDaemon(true);
		mt.setPriority(1);
		mt.start();
		System.out.println(Thread.currentThread().getPriority());

		new Thread(new MyRunnable()).start();

		Thread t = Thread.currentThread();
		t.setPriority(9);
		System.out.println(Thread.currentThread().getPriority());
		Thread.yield();

		MyTools.pause();
		// mt.interrupt();
	}
}
