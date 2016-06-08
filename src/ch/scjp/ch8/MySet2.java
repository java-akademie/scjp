package ch.scjp.ch8;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MySet2
{
	static Set<String> forms = new TreeSet<String>();



	public static void main(String[] args)
	{
		forms.add("oratorium");
		forms.add("sonate");
		forms.add("thema und variationen");
		for (Iterator<String> it = forms.iterator(); it.hasNext();)
		{
			String s = (it.next());
			System.out.println(s);
		}
		System.out.println("\n 111 \n");
		String[] a = forms.toArray(new String[0]);
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("\n 222 \n");
		Object[] b = forms.toArray();
		for (int i = 0; i < b.length; i++)
		{
			System.out.println(b[i]);
		}
		System.out.println("\n 333 \n");
		// String[]c=forms.toArray();
		// String[]d=(String[]);
		Object[] e = forms.toArray(new String[] {});
		for (int i = 0; i < e.length; i++)
		{
			System.out.println(e[i]);
		}
		// String[]f=(String[])forms.toArray();
		int[] i = new int[] { 1, 2, 3, 4, 5 };
		System.out.println(i);
	}
}
