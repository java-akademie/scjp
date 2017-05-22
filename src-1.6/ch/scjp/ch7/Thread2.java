package ch.scjp.ch7;

public class Thread2 extends Thread
{
	static int z;


	public static void main(String[] args)
	{
		Thread2 th1 = new Thread2();
		Thread2 th2 = new Thread2();
		Thread2 th3 = new Thread2();

		th1.setPriority(9);
		th2.setPriority(1);
		th3.setPriority(5);

		th1.start();
		th2.start();
		th3.start();
	}


	int tn;


	Thread2()
	{
		tn = ++z;
	}


	@Override
	public void run()
	{
		for (int i = 1; i <= 1000; i++)
		{
			System.out.println(tn + "/" + i);
		}
	}

}
