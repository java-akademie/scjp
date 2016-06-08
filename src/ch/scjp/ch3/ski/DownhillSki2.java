package ch.scjp.ch3.ski;

import ch.java_akademie.tools.MyTools;

class DownhillSki2
{
	int aaa = 4711;
	static Ski x = new Ski();


	public static void main(String[] args)
	{
		DownhillSki2 s = new DownhillSki2();
		s.applyWax();
		s.tuneUp();
		MyTools.pause();
	}


	public void applyWax()
	{
		x.applyWax();
		System.out.println("dh wachs wird aus x aufgetragen");
	}


	void tuneUp()
	{

		class X
		{
			int i;


			X(int i)
			{
				aaa++;
				this.i = i;
			}


			void show()
			{
				System.out.println(i + " " + aaa);
			}
		}

		X x1, x2;
		x.applyWax();
		x1 = new X(25);
		x1.show();
		x2 = new X(27);
		x2.show();
		x1.show();

	}
}
