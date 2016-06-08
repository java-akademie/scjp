package ch.scjp.ch6.uebungen;

import java.util.AbstractCollection;
import java.util.List;
import java.util.Vector;

/**
 * Test von instanceof.
 */
public class Test2
{


	public static void main(String[] args)
	{
		new Test2().go();
	}


	private void go()
	{


		@SuppressWarnings("unused")
		List<Object> l = new Vector<Object>();
		Vector<Object> v = new Vector<Object>();

		if (v instanceof AbstractCollection<?>)
		{
			System.out.println("l ist instance of List");
		}
		else
		{
			System.out.println("l ist keine instance of List");
		}

	}

}
