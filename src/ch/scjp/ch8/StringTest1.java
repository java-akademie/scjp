package ch.scjp.ch8;

public class StringTest1
{
	public static void main(String[] args)
	{
		new StringTest1();
	}


	StringTest1()
	{
		test1();
	}


	void test1()
	{
		StringBuffer sb = new StringBuffer("hugo");
		Object o = sb;
		String s = "hugo";
		if (sb == o)
		{
			System.out.println("sb==o");
		}
		if (sb.equals(o))
		{
			System.out.println("sb.equals(o)");
		}
		System.out.println(o + " " + sb + " " + s);
		if (s.equals("hugo"))
			System.out.println("s.equals(hugo)");
		if (!s.equals(sb))
			System.out.println("! s.equals(sb)");
		if (s.equals(sb.toString()))
			System.out.println("s.equals(sb+'')");
	}
}
