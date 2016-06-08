package ch.scjp.ch2;

public class TestFlags
{
	static Flags f;


	static void check(int flag)
	{

		if (f.issetFlag(flag))
			System.out.println(flag + " set");
		else
			System.out.println(flag + " not set");
	}


	public static void main(String[] args)
	{
		f = new Flags("110011");
		f.show();

		f.setFlag(1);
		f.setFlag(3);
		f.setFlag(4);
		f.deleteFlag(3);
		f.show();

		check(32);
	}
}
