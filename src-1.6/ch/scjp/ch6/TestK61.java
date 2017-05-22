package ch.scjp.ch6;

class Mensch extends Object
{
	String name;


	Mensch()
	{
	}


	Mensch(String name)
	{
		super();
		this.name = name;
	}


	void show()
	{
		System.out.println("\n" + name);
	}
}



class Mitarbeiter extends Mensch
{
	int salaer;


	Mitarbeiter(String name, int salaer)
	{
		// super(name);
		this.salaer = salaer;
	}


	@Override
	void show()
	{
		super.show();
		System.out.println("" + salaer);
	}
}



public class TestK61
{


	public static void main(String[] args)
	{
		Mensch p = new Mensch("hugo");
		Mensch ma = new Mitarbeiter("hubert", 1000);
		p.show();
		ma.show();
	}

}
