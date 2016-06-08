package ch.scjp.ch6;

public class TestKartenfarbe
{


	public static void main(String[] args)
	{
		Suit karte = Suit.KARO;

		System.out.println(karte);
		System.out.println(Suit.HERZ);
		System.out.println(Suit.PIK);
		System.out.println(Suit.KREUZ);

	}

}



enum Suit
{

	KARO(true), HERZ(true), PIK(false), KREUZ(false);

	boolean red;


	public String toString()
	{
		return name() + ":" + (red?"ROT":"SCHWARZ");
	}


	Suit(boolean red)
	{
		this.red = red;
	}
}
