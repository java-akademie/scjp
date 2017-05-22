package ch.scjp.ch6;

public class TestK63
{
	static class Bar2
	{
		void show()
		{
			System.out.println("bar2");
		}

	}


	public static void main(String[] args)
	{
		new TestK63();

		Bar2 b2 = new Bar2();
		b2.show();

	}


	int x = 42;


	TestK63()
	{
		foo(125);
		Bar2 b2 = new Bar2();
		b2.show();
	}


	private void foo(final int i)
	{
		@SuppressWarnings("unused")
		class Bar
		{
			void show()
			{
				System.out.println("" + (x + i));
			}
		}
	}
}
