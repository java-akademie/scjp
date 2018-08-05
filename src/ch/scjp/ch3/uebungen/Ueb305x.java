package ch.scjp.ch3.uebungen;

public class Ueb305x
{
	private static int zaehler1 = 0;
	private static int zaehler2 = 0;


	public static void main(String[] args)
	{

		int max = 10000000;

		if (args.length > 0)
		{
			System.out.println(args[0]);
			max = Integer.parseInt(args[0]);
		}
		else
		{
			System.out.println("keine argumente uebergeben");
		}

		Ueb305x t;

		for (int i = 0; i < max; i++)
		{
			t = new Ueb305x(i, i * 2);
			if (i % 100000 == 0)
			{
				System.gc();
				t.show();
			}
		}
	}
	private int x;


	private int z; // zaehler wegen test gc()


	public Ueb305x(int x, int y)
	{
		this.x = x;
		z = zaehler1++; // hochzaehlen eines keys
	}


	@Override
	protected void finalize() // throws IOException
	{
		zaehler2++;
		show();
		// if (zaehler2 % 10000==0) show();
	}


	public void show()
	{
		System.out.println("" + "     x=" + x + "   zhl=" + z
				+ "    gc=" + zaehler2);
	}
}
