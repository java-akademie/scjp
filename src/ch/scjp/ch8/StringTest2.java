package ch.scjp.ch8;

public class StringTest2
{
	public static void main(String[] args)
	{
		int a = 1;
		label1:
		// a=1;
		while (true)
		{
			if (a == 1)
				break label1;
		}
		a = 2;
		StringTest1 ch811 = new StringTest1();
		StringTest1 ch812 = new StringTest1();
		ch811 = ch812;
		if (ch811 == ch812)
			System.out.println("==");
		if (ch811.equals(ch812))
			System.out.println("equals");
		System.out.println(ch811);
	}


	StringTest2()
	{
		test3();
		test2();
		test1();
	}


	void bool()
	{
		Boolean b1 = new Boolean(true);
		Boolean b2 = new Boolean("TRUE");
		Boolean b3 = new Boolean("xyz"); // false
		System.out.println("" + b1 + b2 + b3);
	}


	boolean equals(StringTest2 that)
	{
		if (this == that)
			return false;
		else
			return false;
	}


	void istDigit()
	{
		System.out.println("ist digit(123)" + Character.isDigit('1'));
	}


	void stringBuffer()
	{
		StringBuffer sb1 = new StringBuffer(2000);
		StringBuffer sb2 = new StringBuffer();
		// StringBuffer sb3 = new StringBuffer("xxx");
		sb1 = new StringBuffer("xxx");
		sb2 = new StringBuffer("xxx");
		// sb1=sb2;
		if (sb1 == sb2)
		{
			System.out.println("===========");
		}
		else
		{
			System.out.println("not ===========");
		}

		if (sb1.toString().equals(sb2.toString()))
		{
			System.out.println("equzals===========");
		}
		else
		{
			System.out.println("not equzals===========" + sb1 + sb2);
		}
	}


	void test1()
	{
		stringBuffer();
		bool();
		istDigit();
		Integer i;
		i = Integer.valueOf("123456");
		i = new Integer(Integer.parseInt("1234"));
		int j = Integer.parseInt("123");
		System.out.println(i + " ssssssssssssssss " + j);
		char c = 31;
		if (Character.isDigit(c))
			System.out.println("c is digit " + c);
		else
			System.out.println("c is not digit " + c);
	}


	void test2()
	{
		String s1 = "hugo";
		String s2 = "HUgO";
		String s3 = s1.concat(s2);
		System.out.println("concat:" + s3);
		System.out.println(s1.charAt(2));
		System.out.println(s1.endsWith("o"));
		System.out.println(s1.equals(s2) + " bbbb");
		System.out
				.println(s1.equalsIgnoreCase(s2) + " aaaa " + s1 + s2);
	}


	void test3()
	{
		StringBuffer sb = new StringBuffer();
		StringBuffer sb2 = sb.append(this);
		System.out.println(sb);
		System.out.println(sb2);
	}


	@Override
	public String toString()
	{
		return super.toString() + " xxx ";
	}
}
