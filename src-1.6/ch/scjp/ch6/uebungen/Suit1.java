package ch.scjp.ch6.uebungen;

public enum Suit1
{
	KARO(true), HERZ(true), PIK(false), KREUZ(false);
	public static void main(String[] args)
	{
		if (Suit.HERZ.isRed())
		{
			System.out.println("red...");
		}

		Suit herz = Suit.HERZ;
		System.out.println(herz);

		Suit karo = Suit.KARO;
		System.out.println(karo);

		Suit kreuz = Suit.KREUZ;
		System.out.println(kreuz);

		Suit pik = Suit.PIK;
		System.out.println(pik);
	}


	boolean red;


	Suit1(boolean red)
	{
		this.red = red;
	}


	boolean isRed()
	{
		return red;
	}


	@Override
	public String toString()
	{
		return this.name() + ":" + (this.isRed() ? "red" : "black");
	}

	// Ergebnis:
	// ---------
	// HERZ:red
	// KARO:red
	// KREUZ:black
	// PIK:black
}
