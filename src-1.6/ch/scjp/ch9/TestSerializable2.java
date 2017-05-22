package ch.scjp.ch9;


public class TestSerializable2
{

	static void foo(long... l)
	{
		for (long i : l)
		{
			System.out.println(i);
		}
	}


	public static void main(String[] args)
	{
		foo(new long [] {1l,2l,3l});

	}
}
