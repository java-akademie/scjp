package ch.scjp.ch5;

public class ExceptionUebung
{
	public static void main(String[] args) throws MySubException
	{
		try
		{
			SuperKlasse.meth();
		}
		catch (MySuperException e)
		{
			e.printStackTrace();
		}
	}
}



class MySubException extends MySuperException
{
	private static final long serialVersionUID = 1L;


	MySubException(String s)
	{
		super("MySubException-" + s);
	}
}



class MySuperException extends Exception
{
	private static final long serialVersionUID = 1L;


	MySuperException(String s)
	{
		super("MySuperException-" + s);
	}
}



class SubKlasse extends SuperKlasse
{
	static void meth() throws MySubException
	{
		throw new MySubException("SubKlasse");
	}
}



class SuperKlasse
{
	static void meth() throws MySuperException
	{
		throw new MySubException("SuperKlasse");
	}
}
