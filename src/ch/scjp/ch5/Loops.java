package ch.scjp.ch5;

public class Loops
{

	static int i = 0;
	static int j = 0;
	static int k = 0;


	static void add()
	{
		i++;
	}


	public static void main(String[] args)
	{
		for (i = 4, j = 7, k = i * j; i < 1000; add(), add())
		{
			System.out.printf("\n %5d %5d %5d", i, j, k);
		}
	};
}
