package ch.scjp.ch1;

/**
 * Test Initialisierungsbloecke.
 * 
 * @author johann
 * 
 */
public class Uebung13
{
	static int classVariable;


	public static void main(String[] args)
	{
		System.out.println("start");
		new Uebung13().test1();
		System.out.println("mitte");
		new Uebung13().test1();
		System.out.println("end");
	}

	int memberVariable;

	static
	{
		System.out.println("static vor   " + classVariable);
		classVariable = 4711;
		System.out.println("static nach  " + classVariable);
	}


	{
		System.out.println("vor  " + memberVariable);
		memberVariable = 2410;
		System.out.println("nach " + memberVariable);
	}


	Uebung13()
	{
		System.out.println("..." + classVariable);
		System.out.println("..." + memberVariable);
	}


	private void test1()
	{
		System.out.println("test1  " + memberVariable);
	}

}
