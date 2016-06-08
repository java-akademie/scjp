package ch.scjp.ch7;

public class Thread11 extends Thread
{
	private int id;


	public Thread11(int id)
	{
		super();
		this.id = id;
	}


	@Override
	public void run()
	{
		for (int i = 1; i <= 10; i++)
		{
			System.out.println(id + " " + i);
		}
	}
}
