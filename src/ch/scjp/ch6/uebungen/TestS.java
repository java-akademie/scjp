package ch.scjp.ch6.uebungen;

class Class
{
	String x;


	Class()
	{
	}


	Class(String x)
	{
		this.x = x;
	}


	void show2()
	{
		System.out.println("....");
	}
}



interface Interface2
{
	void show();
}



public class TestS
{
	protected static class x
	{
		void show()
		{
			System.out.println("show of class x");
		}
	}


	public static void main(String[] args)
	{
		System.out.println("------------------");
		Super p = new Super("new Super");
		p.show();
		System.out.println("------------------");
		Sub s = new Sub("new Sub");
		s.show();
		Super.meth();
		System.out.println("------------------");

		x xx = new x();
		xx.show();

		Interface i = new Interface()
		{
			@Override
			public void show()
			{
				System.out.println("show aus Interface");
			}
		};
		i.show();

		Class c = new Class("hugo")
		{
			@Override
			public void show2()
			{
				super.show2();
				System.out.println("... show aus class " + x);
			}
		};
		c.show2();

		class SubClass extends Class
		{
			@SuppressWarnings("unused")
			SubClass()
			{
			}


			SubClass(String x)
			{
				this.x = x;
			}


			public void show3()
			{
				System.out.println("... show aus subClass " + x);
			}
		}

		SubClass sc = new SubClass("subsubsub");
		sc.show2();
		sc.show3();

	}
}
