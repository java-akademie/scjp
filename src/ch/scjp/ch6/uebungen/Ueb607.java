/*
 * static inner class
 */

package ch.scjp.ch6.uebungen;

class ArrayAllgemein
{
	static class Pair
	{
		int i1, i2;


		Pair(int i1, int i2)
		{
			this.i1 = i1;
			this.i2 = i2;
		}


		int getI1()
		{
			return i1;
		}


		int getI2()
		{
			return i2;
		}


		void show()
		{
			System.out.println(i1 + "/" + i2);
		}
	}


	static int max(int[] a)
	{
		if (a.length == 0)
			return 0;
		int m = a[0];
		for (int i = 1; i < a.length; i++)
		{
			if (m < a[i])
				m = a[i];
		}
		return m;
	}


	static int min(int[] a)
	{
		if (a.length == 0)
			return 0;
		int m = a[0];
		for (int i = 1; i < a.length; i++)
		{
			if (m > a[i])
				m = a[i];
		}
		return m;
	}


	static Pair minmax(int[] a)
	{
		int min, max;
		if (a.length == 0)
		{
			min = max = 0;
		}
		else
		{
			min = max = a[0];
			for (int i = 1; i < a.length; i++)
			{
				if (min > a[i])
					min = a[i];
				if (max < a[i])
					max = a[i];
			}
		}
		return new Pair(min, max);
	}
}



public class Ueb607
{
	public static void main(String[] a)
	{
		new Ueb607();
	}


	int[] i = { 4, 1, 3, 9, 7, 6, -75, 3, 3722, 66, 12 };


	Ueb607()
	{
		System.out.println("min=" + ArrayAllgemein.min(i));
		System.out.println("max=" + ArrayAllgemein.max(i));
		ArrayAllgemein.Pair p = ArrayAllgemein.minmax(i);
		p.show();
	}
}
