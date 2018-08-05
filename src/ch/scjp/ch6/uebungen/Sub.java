package ch.scjp.ch6.uebungen;

public class Sub extends Super
{
	static void meth1()
	{
		System.out.println("meth aus Sub");
	}


	Sub(String x)
	{
		// super(x);
		super.meth();
		System.out.println("Sub(String) : " + x);
	}
}
