package ch.scjp.ch7;

class Thread14a extends Thread
{
	int id;


	Thread14a(int id)
	{
		this.id = id;
	}


	@Override
	public void run()
	{
		for (int i = 1; true; i++)
		{
			if (i % 10000000 == 0)
				System.out.println(id + " : " + i);
		}
	}
}



public class Uebung14
{
	public static void main(String[] args) throws Exception
	{
		Thread th1 = new Thread14a(1);
		Thread th2 = new Thread14a(2);
		th1.start();
		th2.start();
	}
}
