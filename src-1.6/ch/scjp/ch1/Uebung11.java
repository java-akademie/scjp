package ch.scjp.ch1;

/**
 * Test von unsymmetrischen Arrays.
 * 
 * @author johann
 * 
 */
public class Uebung11
{
	public static void main(String[] args)
	{
		new Uebung11().test1();
	}


	String[][] sa;


	private void test1()
	{
		sa = new String[3][];
		sa[0] = new String[] { "0.0", "0.1", "0.2", "0.3" };
		sa[1] = new String[] { "1.0", "1.1", "1.2" };
		sa[2] = new String[] { "2.0", "2.1", "2.2", "2.3", "2.4" };

		for (int i = 0; i < sa.length; i++)
		{
			System.out.println('\n');
			String komma = "";
			for (int j = 0; j < sa[i].length; j++)
			{
				System.out.print(komma + sa[i][j]);
				komma = ",  ";
			}
		}
	}



}
