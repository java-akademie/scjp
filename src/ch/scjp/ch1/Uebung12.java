package ch.scjp.ch1;

import static ch.scjp.ch1.tools.Tools.add;
import static ch.scjp.ch1.tools.Tools.max;
import static ch.scjp.ch1.tools.Tools.min;

import ch.scjp.ch1.tools.Tools;

/**
 * Test import und static import.
 * 
 * @author johann
 * 
 */
public class Uebung12
{
	public static void main(String[] args)
	{
		Uebung12 u12 = new Uebung12();

		u12.test1();
		u12.test2();
		u12.test3();
	}


	private void test1()
	{
		// damit diese Befehle funktionieren ben�tigt es
		// die folgenden drei imports:
		// import static ch.scjp.ch1.tools.Tools.max;
		// import static ch.scjp.ch1.tools.Tools.min;
		// import static ch.scjp.ch1.tools.Tools.add;
		System.out.println(add(5, 7));
		System.out.println(min);
		System.out.println(max);
	}


	private void test2()
	{
		// damit diese Befehle funktionieren ben�tigt es
		// den folgenden import:
		// import ch.scjp.ch1.tools.Tools;
		System.out.println(Tools.add(5, 7));
		System.out.println(Tools.min);
		System.out.println(Tools.max);
	}


	private void test3()
	{
		// so gehts immer
		System.out.println(ch.scjp.ch1.tools.Tools.add(5, 7));
		System.out.println(ch.scjp.ch1.tools.Tools.min);
		System.out.println(ch.scjp.ch1.tools.Tools.max);
	}
}
