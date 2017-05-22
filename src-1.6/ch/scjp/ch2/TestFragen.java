package ch.scjp.ch2;

public class TestFragen
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Object a=new Foo();
		Object b=new Foo();
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
	}

	
}
class Foo{
	public boolean equals(Object o)
	{
		return true;
	}
}