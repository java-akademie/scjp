package ch.scjp.ch8.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Generics
{
	public static void main(String[] args)
	{
		new Generics();
	}


	private Generics()
	{
		test1();
		test2();
	}


	private void show(List<? extends Object> l)
	{
		for (Object o : l)
			System.out.println(o);

	}


	private void test1()
	{
		List<String> l = new Vector<String>();
		l.add("hugo");
		l.add("moritz");
		show(l);
	}


	private void test2()
	{
		List<Integer> i = new ArrayList<Integer>();
		i.add(new Integer(1));
		i.add(2);
		show(i);
	}
}
