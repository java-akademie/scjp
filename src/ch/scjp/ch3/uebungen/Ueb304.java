package ch.scjp.ch3.uebungen;

import ch.java_akademie.tools.MyTools;

public class Ueb304
{
	static void add(int j)
	{
		j++;
		System.out.println("ende add " + j);
	}


	static void add2(int[] j)
	{
		j[0]++;
		System.out.println("ende add " + j[0]);
	}


	public static void main(String[] args)
	{

		int j = 25;
		System.out.println("vor add " + j);
		add(j);
		System.out.println("nach add " + j);

		System.out.println("vor add " + j);
		int[] ueb = { j };
		add2(ueb);
		j = ueb[0];
		System.out.println("nach add " + j);

		MyTools.pause();
	}

}
