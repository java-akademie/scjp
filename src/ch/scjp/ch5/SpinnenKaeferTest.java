package ch.scjp.ch5;

public class SpinnenKaeferTest
{
	public static void main(String[] args)
	{
		SpinnenKaefer sk = new SpinnenKaefer();

		for (int i = 0; i <= 100; i = i + 2)
		{
			try
			{
				int tiere[] = sk.getTiere(i);

				System.out.println("Beine: " + i + " Kaefer: "
						+ tiere[0] + " Spinnen : " + tiere[1]);
			}
			catch (AnzahlBeineException e)
			{
				System.out.println(e);
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
		}
	}

}
