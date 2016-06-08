package ch.scjp.ch6.uebungen;

public class Anonym
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		class Foo
		{
			public void doit()
			{
				System.out.println("zzz");
			}


		}
		Bar b = new Bar()
		{
			@Override
			public void doit()
			{
				System.out.println("xxx");
			}
		};

		b.doit();

		Foo f = new Foo()
		{
			@Override
			public void doit()
			{
				// super.doit();
				System.out.println("aaa ");
			}
		};
		f.doit();
		f.doit();

	}

}



interface Bar
{
	void doit();
}
