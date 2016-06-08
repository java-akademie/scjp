package ch.scjp.ch6.uebungen;

public class Test6
{
	interface iperson
	{
		void show();
	}

	public static class person
	{
		String name;


		person(String name)
		{
			this.name = name;
		}


		void show()
		{
			System.out.println(name);
		}
	}


	String mv = "mv test6";

	static String cv = "cv test6";


	public static void main(String[] args) throws Exception
	{
		test1();
		test2();
		test3();
	}


	static void test1()
	{
		new person("hugo").show();
	}


	static void test2()
	{
		@SuppressWarnings("hiding")
		abstract class person
		{
			String name;


			person(String name)
			{
				this.name = name;
			}


			void show()
			{
				System.out.println(name);
			}
			// abstract void x();
		}
		new person("hugo")
		{
		}.show();
	}


	static void test3()
	{
		new iperson()
		{
			String name;


			@Override
			public void show()
			{
				System.out.println(name);
			}
		}.show();
	}
}
