package ch.scjp.ch7;

public class Thread21 extends Thread
{
	private int id;


	public Thread21(int id)
	{
		super();
		this.id = id;
	}


	@Override
	public void run()
	{
		int summe = 0;

		for (int i = 1; i <= 10; i++)
		{
			summe += i;
		}

		System.out.println(id + " " + summe);
	}
}
