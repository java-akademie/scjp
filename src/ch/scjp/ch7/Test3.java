package ch.scjp.ch7;

public class Test3
{
	public static void main(String[] args)
	{
		System.out.println("test3");

		new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				System.out.println("rrrrrrrrrrrr");
			}
		}).start();
	}

}
