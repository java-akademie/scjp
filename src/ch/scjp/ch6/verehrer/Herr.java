package ch.scjp.ch6.verehrer;


public class Herr implements Verehrer
{
	String name;


	public Herr(String name)
	{
		this.name = name;
	}


	@Override
	public void anruf(String name)
	{
		System.out.println(this.name + ": hurra, " + name
				+ " hat angerufen");
	}
}
