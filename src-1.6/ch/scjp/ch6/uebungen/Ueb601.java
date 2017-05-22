package ch.scjp.ch6.uebungen;

class Base
{
	public Base()
	{
		this(111);
	}


	public Base(int i)
	{
		System.out.println("base " + i);
	}


	public Base(String s)
	{
		System.out.println("base " + s);
	}
}



class Derived extends Base
{
	public Derived()
	{
		this("ggg");
	}


	public Derived(int i)
	{
		super(i);
		System.out.println("derived " + i);
	}


	public Derived(String s)
	{
		super(s);
		System.out.println("derived " + s);
	}
}



public class Ueb601
{
	public static void main(String[] args)
	{
		// Derived s = new Derived("hugo");
		// Derived i = new Derived(4711);
		new Base();
		new Derived();
	}
}
