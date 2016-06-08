package ch.scjp.ch3.uebungen;

import ch.java_akademie.tools.MyTools;

public class Ueb302
{
	public static void main(String[] args)
	{
		char c;

		c = 'x';
		System.out.println(c);
		c = '\u1234';
		System.out.println(c);
		c = '\b';
		System.out.println(c);
		c = '\f';
		System.out.println(c);
		c = '\r';
		System.out.println(c);
		c = '\\';
		System.out.println(c);
		c = '\"';
		System.out.println(c);
		c = '\'';
		System.out.println(c);

		byte b = 1;
		short s = 5;
		int i = 11;
		long l = 111L;

		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);

		if (111L == l)
			System.out.println("xxx");

		float f = 1f;
		double d = 1111d;

		System.out.println(f);
		System.out.println(d);

		if (d == 1111)
			System.out.println("ddd1");
		if (d == 1111f)
			System.out.println("ddd2");
		if (d == 1111d)
			System.out.println("ddd3");
		if (d == 1111L)
			System.out.println("ddd4");

		double x = l / -0d;
		double y = l / 0.0;
		double z = Math.sqrt(-1);

		if (x == Double.POSITIVE_INFINITY)
			System.out.println("pi");
		if (x == Double.NEGATIVE_INFINITY)
			System.out.println("ni");
		if (Double.isNaN(z))
			System.out.println("nan");

		System.out.println(x);
		System.out.println(y);

		MyTools.pause();

	}
}
