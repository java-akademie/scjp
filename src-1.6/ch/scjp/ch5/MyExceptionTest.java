package ch.scjp.ch5;

public class MyExceptionTest
{
	static int i = 222;


	public static void main(String[] args) throws Throwable
	{
		if (i != 0)
			throw new MyException("" + i);
	}
}
