/**
 * inner classe and interfaces
 */

package ch.scjp.ch6.uebungen;

import ch.java_akademie.tools.MyTools;

class Class602
{
	public class Inner6021
	{
		Inner6021(String x)
		{
			System.out.println("Konstruktor Class6021 ... Parm: " + x);
		}


		void show()
		{
			System.out.println("show-Methode Class6021");
		}
	}


	Inner6021 ic = null;


	public Class602()
	{
		System.out.println("Konstruktor Class602");
		show();
		ic = new Inner6021("parm6021");
		ic.show();
	}


	public void show()
	{
		System.out.println("show-Methode Class602");
	}
}



public class Ueb602
{
	public static void main(String[] args)
	{
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Uebung 602: inner classes and interfaces");
		System.out.println("----------------------------------------");
		System.out.println();
		Class602 c602 = new Class602();
		System.out.println(c602);
		System.out.println("----------------------------------------");
		MyTools.pause();
	}
}
