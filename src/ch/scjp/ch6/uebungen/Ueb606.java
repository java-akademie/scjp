package ch.scjp.ch6.uebungen;

public class Ueb606
{
	class Bruch // inner Class
	{
		long z, n;


		Bruch(double d)
		{
			if (d > 1.0)
			{
				System.out
						.println("bruch groesser 1 noch nicht implementiert");
				groesserEins(d);
				return;
			}
			boolean ok = false;
			while_not_ok: while (!ok)
			{
				System.out.println("yyy ");
				for_z: for (z = 1;; z++)
				{
					for (n = z + 1;; n++)
					{
						System.out.println("zzz " + z + "/" + n + "="
								+ (double) z / (double) n + "/" + d);
						if ((double) z / (double) n < d)
						{
							continue for_z;
						}
						if ((double) z / (double) n == d)
						{
							break while_not_ok;
						}
					}
				}
			}
		}


		Bruch(long z, long n)
		{
			this((double) z / (double) n);
		}


		void groesserEins(double d)
		{
			System.out.println(d);
			z = (long) d;
			n = 1;
			while (z < d)
			{
				n = n * 10;
				d = d * 10;
				z = (long) d;
				System.out.println((long) d + " " + d);
			}
			System.out.println(d);
		}


		void mult(Bruch b)
		{
			this.z = this.z * b.z;
			this.n = this.n * b.n;
		}


		void show()
		{
			System.out.println("zaehler  = " + z);
			System.out.println("nenner   = " + n);
			System.out.println("ergebnis = " + (double) z / (double) n);
		}
	}
	Bruch sb = new Bruch(1, 9);


	static Bruch b, c;


	public static void main(String[] args)
	{
		// b=new Bruch(1,2);
		// b.show();
		new Ueb606();
	}


	Ueb606()
	{
		b = new Bruch(5, 8);
		b.show();
		b.mult(new Bruch(3, 5));
		b.show();
		c = new Bruch(0.375);
		c.show();
		c = new Bruch((double) 777 / (double) 999);
		c.show();
		c = new Bruch(1, 9);
		c.show();
		c = new Bruch(3.14159);
		c.show();
		System.out.println("111");
		c = new Bruch(78993345, 234);
		c.show();
		System.out.println("222");
		c = new Bruch(712, 24);
		c.show();
		System.out.println("ende");
	}
}
