package ch.scjp.ch5;

import java.io.IOException;

class AnzahlBeineException extends Exception
{

	private static final long serialVersionUID = 1L;


	AnzahlBeineException(int beine)
	{
		super("Anzahl Beine (" + beine + ") nicht erlaubt");
	}
}



public class SpinnenKaefer
{
	public int[] getTiere(int beine) throws AnzahlBeineException,
			IOException
	{
		int diff = beine;
		int[] tiere = { 0, 0 };
		boolean loesung = false;

		for (int i = 0, x = beine / 6; i <= x; i++)
		{
			for (int j = 0; j <= x; j++)
			{
				if (i * 6 + j * 8 == beine)
				{
					if (Math.abs(i - j) < diff)
					{
						diff = Math.abs(i - j);
						tiere[0] = i;
						tiere[1] = j;
						loesung = true;
					}
				}
			}
		}

		if (loesung)
		{
			return tiere;
		}
		else
		{
			// throw new IOException("xxx");
			throw new AnzahlBeineException(beine);
		}

	}
}
