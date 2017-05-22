package ch.scjp.ch4;

class Apfel extends Kernobst
{
}



interface Auspressbar
{
}



class Frucht
{
}



class Kernobst extends Frucht
{
}



class Kirsche extends Kernobst
{
}



class Orange extends Zitrus
{
}



public class Ueb43
{
	static Object o1, o2, o3;
	static Frucht f1, f2, f3;
	static Zitrus z1, z2, z3;
	static Kernobst k1, k2, k3;
	static Auspressbar a1, a2, a3;


	public static void main(String[] args)
	{
		o1 = new Orange();
		o2 = new Apfel();

		Auspressbar a1 = null, a2 = null, a3 = null;

		a1 = (Auspressbar) o1;

		System.out
				.println("verhindert warnung: a1,a2,a3 never read \n  a1="
						+ a1 + "\n  a2=" + a2 + "\n  a3=" + a3);
	}
}



class Zitrone extends Zitrus
{
}



class Zitrus extends Frucht implements Auspressbar
{
}
