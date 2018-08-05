package ch.scjp.ch7;

public class Runnable1 implements Runnable
{
	private int id;


	public Runnable1(int id)
	{
		super();
		this.id = id;
	}


	@Override
	public void run()
	{
		for (int i = 1; i <= 1000; i++)
		{
			System.out.println(id + " " + i);
		}
	}
}
