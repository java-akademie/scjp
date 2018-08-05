package ch.scjp.ch6;

public class AnonymeKlasseTest
{
	static Brueller2 ungeheuer = new Brueller2()
	{
		@Override
		public void bruellen()
		{
			System.out.println("uuuuaaaaaahhhhhhhhhh");
			foo();
		}


		void foo()
		{
		}
	};
	
	static {
		ungeheuer.bruellen();
	}
	public static void main(String[] args)
	{
		Brueller2 h = new Hund();
		h.bruellen();
		
		ungeheuer.bruellen();
	}

}



interface Brueller2
{
	void bruellen();
}



class Brueller3
{
	void bruellen()
	{
	}
}



class Hund implements Brueller2
{

	// @Override
	public void bruellen()
	{
		System.out.println("wau wau");
	}

}
