package ch.scjp.ch6.uebungen;

public class Ueb605
{
	static class Zaehler
	{
		int z = 0;


		Zaehler() // muss nicht instantiiert werden
		{
			// z=0;
		}


		void add()
		{
			// z++;
		}


		void show()
		{
			System.out.println("zaehler=" + z);
		}


		void sub()
		{
			// z--;
		}
	}


	public static void main(String[] args)
	{
		new Ueb605.Zaehler();
	}


	Ueb605()
	{
		System.out.println("xxx");
		Zaehler z = new Zaehler();
		z.show();
		Ueb605 u;
		u = new Ueb605();
		u = new Ueb605();
		u = new Ueb605();
		u = new Ueb605();
		u = new Ueb605();
		u = new Ueb605();
		u = new Ueb605();
		u = new Ueb605();
		u = new Ueb605();
		u = new Ueb605();
		u = new Ueb605();
		u = new Ueb605();
		u = new Ueb605();
		u = new Ueb605();
		u = new Ueb605();
		new Ueb605.Zaehler();
		u = new Ueb605();
		u = new Ueb605();

		System.out.println("u=" + u);
	}
}
