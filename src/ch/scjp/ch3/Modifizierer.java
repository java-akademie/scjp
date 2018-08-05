package ch.scjp.ch3;

public class Modifizierer
{

	public Modifizierer(String name)
	{
		this.name=name;
		System.out.println(name);
	}
	static int zhl;
	static int x;
	
	int id;
	
	String name;

	{
		id = 2;
		System.out.println(id);
	}


	static
	{
		zhl = 5;
		System.out.println(zhl);
	}
	
	{
		name="hugo";
		System.out.println(name);
	}
	static
	{
		x = 55;
	}
	
	int j=5;
	static
	{
		
		System.out.println(x);
	}

}
