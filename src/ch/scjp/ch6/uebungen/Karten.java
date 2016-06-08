package ch.scjp.ch6.uebungen;

public class Karten
{
	public static void main(String[] args)
	{
		Suit k = Suit.HERZ;

		System.out.println(k + "");
		System.out.println(k.isRed());

	}
}



enum Suit
{
	KARO(true), KREUZ(false), PIK(false), HERZ(true);

	boolean red; // karo,herz=true, pik,kreuz=false


	Suit(boolean red)
	{
		this.red = red;
		System.out.println("k:" + red);
	}


	boolean isRed()
	{
		return red;
	}


	@Override
	public String toString()
	{
		return name() + ":" + (red == true ? "red" : "black ");
	}
}
