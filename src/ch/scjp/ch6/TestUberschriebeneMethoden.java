package ch.scjp.ch6;

import java.util.Scanner;

public class TestUberschriebeneMethoden
{

	private static Scanner s;


	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		M11.show();

		s = new Scanner(System.in);
		while (true)
		{
			int i = s.nextInt();
			System.out.println(i);
		}
		// s.close();
	}

}



class M1
{
	// M1(){}
	M1(int i)
	{
		super();
		System.out.println("km1");
	}


	static protected void show()
	{
		System.out.println("m1");
	}
}



class M11 extends M1
{
	M11()
	{
		super(1);
		System.out.println("km11");
	}


	static public void show()
	{
		System.out.println("m11");
		M1.show();
	}
}
