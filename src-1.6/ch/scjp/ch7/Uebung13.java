package ch.scjp.ch7;

class Thread13a extends Thread
{
	@Override
	public void run()
	{
		for (int i = 1; i <= 1000; i++)
		{
			System.out.println(i);
		}
	}
}



class Thread13b extends Thread
{
	@Override
	public void run()
	{
		int summe = 0;
		for (int i = 1; i <= 1000; i++)
		{
			summe += i;
		}
		System.out.println(summe);
	}
}



public class Uebung13
{
	public static void main(String[] args) throws Exception
	{
		Thread th1 = new Thread13a();
		Thread th2 = new Thread13b();
		th1.start();
		th2.start();
	}
}
