package ch.scjp.ch5;

class MyException extends Throwable
{
	private static final long serialVersionUID = 1L;


	MyException(String s)
	{
		super("MyException-" + s);
	}
}
