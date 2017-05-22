// anonymous classes

package ch.scjp.ch6.uebungen;

import ch.java_akademie.tools.MyTools;

class BasClass
{
	int x;
	String y;


	BasClass(int x)
	{
		this.x = x;
		System.out.println("bc Konstruktor int " + x);
	}


	BasClass(String y)
	{
		this.y = y;
		System.out.println("bc Konstruktor String " + y);
	}


	void show()
	{
		System.out.println("bc show " + x + " " + y);
	}
}



class Class603
{
	public Class603()
	{
		System.out.println("Konstruktor Class603");
		show();
		BasClass bc = null;
		bc = new BasClass(4711)
		{
			@Override
			void show()
			{
				super.show();
				System.out.println("bc show in anonymer inner Class "
						+ x);
			}
		};
		bc = new BasClass("0815")
		{
			@Override
			void show()
			{
				super.show();
				System.out.println("bc show in anonymer inner Class "
						+ x);
			}
		};
		(bc).show();
		Interface interf = null;
		interf = new Interface()
		{
			@Override
			public void show()
			{
				System.out.println("if show (anon/inner)");
			}
		};
		interf.show();
	}


	public void show()
	{
		System.out.println("show-Methode Class603");
	}
}



interface Interface
{
	void show();
}



public class Ueb603
{
	public static void main(String[] args)
	{
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Uebung 603: anonyne Klasse              ");
		System.out.println("----------------------------------------");
		System.out.println();
		Class603 c603 = new Class603();
		System.out.println(c603);
		System.out.println("----------------------------------------");
		MyTools.pause();
	}
}
