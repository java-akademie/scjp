package ch.scjp.ch6.uebungen;

class Pers
{
	int id;
	String sid;


	Pers(int id)
	{
		this.id = id;
	}



	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final Pers other = (Pers) obj;
		if (id != other.id)
			return false;
		if (sid == null)
		{
			if (other.sid != null)
				return false;
		}
		else
			if (!sid.equals(other.sid))
				return false;
		return true;
	}


	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((sid == null) ? 0 : sid.hashCode());
		return result;
	}
}



public class Test1
{
	static void cls()
	{
		System.out.println('\033' + "[2J");
	}


	public static void main(String[] args)
	{
		System.out.println("------------------");
		cls();
		System.out.println("xxxxxxxxxxxxxxxxxx");

		Object p1 = new Pers(101);
		Object p2 = new Pers(100);
		p1 = p2;

		if (p1.equals(p2))
		{
			System.out.println("gleich");
		}
		else
		{
			System.out.println("ungleich");
		}
	}
}
