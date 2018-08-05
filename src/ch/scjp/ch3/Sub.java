package ch.scjp.ch3;

public class Sub extends Super
{

	public static void main(String[] args)
	{
		System.out.println("sub");
		Sub s = new Sub();
		s.show();
	}


	Sub()
	{
		System.out.println("sub konstruktor");
	}


	@Override
	public void show()
	{
		super.show();
		System.out.println("sub show");
	}

}
