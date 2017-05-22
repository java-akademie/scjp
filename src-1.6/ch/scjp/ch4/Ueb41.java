package ch.scjp.ch4;

public class Ueb41
{
	static void bitwise()
	{
		new Ueb41();
	}


	public static void main(String[] args)
	{
		System.out.println("Converting and Casting");
		u1();
		u2();
		u3();
	}


	static void u1()
	{
		System.out.println("Assingment");
		byte b = 100;
		short s = 100;
		char c = 100;
		int i = 2145678123;
		long l = 8234567892123456789L;

		float f = 1.123f;
		double d = 200;

		// d=f; f=l; l=i; i=c; i=s; s=b;

		d = l;
		f = i;
		System.out.println("s=" + s);
		System.out.println("s=" + s);
		System.out.println("d=" + d);
		System.out.println("f=" + f);
		System.out.println("l=" + l);
		System.out.println("i=" + i);
		System.out.println("s=" + s);
		System.out.println("b=" + b);
		System.out.println("c=" + c);
	}


	static void u2()
	{
		System.out.println("Method Call");
	}


	static void u3()
	{
		System.out.println("Arithmetic promotion");
	}

}
