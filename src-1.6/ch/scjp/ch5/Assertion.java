package ch.scjp.ch5;

import ch.java_akademie.tools.MyTools;

public class Assertion
{

	private static int div(int i, int j)
	{
		assert (j != 0) : "precondition";
		
		int erg=i/j;
		
		
		assert (erg > 0) : "postcondition";
		
		return erg;
	}


	public static void main(String[] args)
	{
		int a = MyTools.getInteger("dividend > ");
		int b = MyTools.getInteger("divisor  > ");
		System.out.println(div(a, b));
		System.out.println(args[2]);

	}
}
