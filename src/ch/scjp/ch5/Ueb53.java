package ch.scjp.ch5;

class Ueb53
{
	public static void main(String[] args)
	{
		first: for (int i = 1; i < 3; i++)
		{
			System.out.print("\ni=" + i);

			for (int j = 0; j < 5; j++)
			{
				switch (j)
				{
					case 1:
					case 2:
						continue first;
					case 3:
						break first;
				}

				System.out.print("j=" + j);
			}
		}

		test(0);
		test(1);
	}


	static void test(int i) // throws RuntimeException, Error
	{
		System.out.println("\ntest");
		throw new RuntimeException("xxx");

	}

}
