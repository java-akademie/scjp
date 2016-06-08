package ch.scjp.ch8;

import java.util.Arrays;

public class Misc extends java.lang.Object
{
	static Object a;


	public static int hashCode(boolean sf)
	{
		return sf ? 0 : 1;
	}


	public static int hashCode(double sf)
	{
		return hashCode(sf + "D");
	}


	public static int hashCode(float sf)
	{
		return hashCode(sf + "F");
	}


	public static int hashCode(int sf)
	{
		return sf;
	}


	public static int hashCode(long sf)
	{
		return (int) (sf ^ (sf >>> 32));
	}


	public static int hashCode(Object sf)
	{
		return sf == null ? 0 : sf.hashCode();
	}


	public static void main(String[] args)
	{
		Boolean iw = new Boolean("xx");
		System.out.println(iw.booleanValue());
		int a[] = { 5, 3, 1, 66, 77, 88, 8, 8, 8, 8, 8, 8 };
		Arrays.sort(a);

		for (int i = 0; i < a.length; i++)
		{
			System.out.print(" " + a[i]);
		}
		int erg = Arrays.binarySearch(a, 88);
		System.out.println("erg=" + erg);

		System.out.println(hashCode(a));
		int[] x = { 1 };
		System.out.println(hashCode(x));
		System.out.println(x.hashCode());
		x[0] = 2;
		System.out.println(x.hashCode());
		int[] y = { 1 };
		System.out.println(y.hashCode());
		int[] z = { 1, 2, 377, 88, 999 };
		System.out.println(z.hashCode());
		System.out.println("hashCode 1:" + hashCode(x));
		System.out.println("hashCode 1:" + hashCode(y));
		System.out.println("hashCode 1:" + hashCode(z));
		System.out.println("hashCode 1:" + hashCode("xxx"));
		System.out.println("hashCode 1:" + hashCode("xxy"));
		System.out.println("hashCode 1:" + hashCode(true));
		System.out.println("hashCode 1:" + hashCode(false));
		System.out.println("hashCode 1:" + hashCode(null));
		System.out.println("hashCode 1:" + hashCode(new Object()));
		System.out.println("hashCode 1:" + hashCode(new Misc()));
		System.out.println("hashCode 1:" + hashCode(new Misc()));
		System.out.println("hashCode 1:" + hashCode(1));
		System.out.println("hashCode 1:" + hashCode(3333));
		System.out.println("hashCode 1:" + hashCode(9999));
		System.out.println("hashCode 1:" + hashCode(9999L));
		System.out.println("hashCode 1:" + hashCode(55.66));
		System.out.println("hashCode 1:" + hashCode(55.66F));
	}
}
