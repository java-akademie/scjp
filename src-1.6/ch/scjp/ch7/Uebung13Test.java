package ch.scjp.ch7;

public class Uebung13Test
{
	public static void main(String[] args) throws InterruptedException
	{
		testThread();
		testRunnable();
	}


	private static void testRunnable()
	{
		Runnable1 r1 = new Runnable1(1);
		Runnable2 r2 = new Runnable2(2);
		Thread th1 = new Thread(r1);
		Thread th2 = new Thread(r2);
		th1.start();
		th2.start();
	}


	private static void testThread() throws InterruptedException
	{
		Thread11 th1 = new Thread11(1);
		Thread21 th2 = new Thread21(2);
		th1.start();
		th2.start();
		th1.join();
		th2.join();

		th1.run();
		th2.run();

		th1.start();
		th2.start();

		System.out.println("ende programm");
	}

}
