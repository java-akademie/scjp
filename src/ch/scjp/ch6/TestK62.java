package ch.scjp.ch6;

interface Brueller
{
	public void bruellen();
}



public class TestK62
{

	static class Person
	{

	}


	static void gibLaut(Brueller b)
	{
		b.bruellen();
	}


	public static void main(String[] args)
	{
		@SuppressWarnings("unused")
		Person p = new Person()
		{
			void voo()
			{
			}
		};

		Brueller gt = new Brueller()
		{

			@Override
			public void bruellen()
			{
				System.out.println("uuuuaaaahhhhhhhhhhhh");

			}
		};
		gibLaut(gt);
	}
}
