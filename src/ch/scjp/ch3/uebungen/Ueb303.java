package ch.scjp.ch3.uebungen;

import ch.java_akademie.tools.MyTools;

public class Ueb303
{
	static int si;


	public static void main(String[] args)
	{
		Ueb303 u3 = new Ueb303();
		System.out.println(Ueb303.si + " " + u3.mi + " " + u3.md + " "
				+ u3.mb);

		String str[];
		str = new String[10];
		for (int i = 0; i < str.length; i++)
		{
			str[i] = "" + i;
		}

		String[] str2 = { "1", "2", "3", "4", "5", "6", "7" };

		for (int i = 0; i < str.length; i++)
			System.out.println(str[i]);
		for (int i = 0; i < str2.length; i++)
			System.out.println(str2[i]);

		int[][] iarr = { // Symmetrie nicht erforderlich
		{ 1, 2, 3 }, { 11, 12, 13, 14, 15 }, { 21, 22, 23, 24 } };

		iarr = new int[2][2];

		for (int i = 0; i < iarr.length; i++)
		{
			for (int j = 0; j < iarr[i].length; j++)
			{
				System.out.println(i + ":" + j + "." + iarr[i][j]);
			}
		}

		MyTools.pause();
	}
	int mi;
	double md;


	boolean mb;

	static
	{
		si = 1000;
	}

	{
		mi = 100;
	}
}
