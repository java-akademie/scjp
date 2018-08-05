package ch.scjp.ch5;

public class Date
{
	public static void main(String[] args)
	{
		Date d = null;
		try
		{
			d = new Date(20, 2, 1900);
			d.show();
		}
		catch (Exception e)
		{

			System.out.println(e.getMessage());
		}

	}
	public int t, m, j;


	private boolean ok;


	public Date(int t, int m, int j) throws Exception
	{
		this.t = t;
		this.m = m;
		this.j = j;

		datumOK();

		if (!ok)
		{
			throw new Exception("Datum ist falsch");
		}
	}


	private void datumOK()
	{
		ok = false;

		if (j < 0)
		{
			return;
		}

		if (m < 1 || m > 12)
		{
			return;
		}

		if (t < 1)
		{
			return;
		}

		if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 | m == 10
				|| m == 12)
		{
			if (t > 31)
				return;
			else
			{
				ok = true;
				return;
			}
		}

		if (m == 4 || m == 6 || m == 9 || m == 11)
		{
			if (t > 30)
				return;
			else
			{
				ok = true;
				return;
			}
		}

		if (j % 400 == 0 & t <= 28)
		{
			ok = true;
			return;
		}

		if (j % 4 == 0 & t <= 29)
		{
			ok = true;
			return;
		}
		else
			if (t <= 28)
			{
				ok = true;
				return;
			}
	}


	public void show()
	{
		System.out.println(this);
	}


	@Override
	public String toString()
	{
		return t + "." + m + "." + j;

	}
}
