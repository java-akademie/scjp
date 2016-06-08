package ch.scjp.ch6.uebungen;

public class Super
{
	static void meth()
	{
		System.out.println("meth aus Super");
	}


	Super()
	{
		System.out.println("Super()");
	}


	Super(String x)
	{
		System.out.println("Super(String): " + x);
	}


	void show()
	{
		System.out.println("show aus Super");
	}
}
