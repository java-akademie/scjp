package ch.scjp.ch4;

import java.io.Serializable;

interface Interf
{
};



public class Ueb42
{
	public static void main(String[] args)
	{
		new Ueb42();
	}


	Ueb42()
	{
		u1();
		u2();
		u3();
	}


	void u1() // alt und neu sind klassen
	{
		class Neu
		{
		}
		@SuppressWarnings("unused")
		class Alt extends Neu
		{
		}

		// Alt a = new Alt();
		// Neu n = a;
	}


	void u2() // alt=klasse neu=interface
	{
		class Neu
		{
		}

		@SuppressWarnings("unused")
		class Alt extends Neu implements Interf
		{
		}

		// Interf a = new Alt();
		// Object n = a;
		// Neu nn=a; Interf ist ein Object
	}


	void u3()
	{
		int[] a = { 1, 2, 3 };

		if (a instanceof Serializable)
		{
			System.out.println("serialisierbar");
		}

	}
}
