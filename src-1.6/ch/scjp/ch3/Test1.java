package ch.scjp.ch3;

public class Test1
{

	public static void main(String[] args) throws ClassNotFoundException
	{
		Class.forName("ch.scjp.ch3.Modifizierer");
		
		new Modifizierer("xxx");
	}

	
}
