package ch.scjp.ch7;

public class Runnable2 implements Runnable
{
	private int id;


	public Runnable2(int id)
	{
		super();
		this.id = id;
	}


	@Override
	public void run()
	{
		int summe = 0;

		for (int i = 1; i <= 1000; i++)
		{
			summe += i;
		}

		System.out.println(id + " " + summe);
	}
}
