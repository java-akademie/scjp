package ch.scjp.ch5;

public class Datum
{
	public static void main(String[] args)
	{
		Datum d = new Datum(31, 12, 1899);
		d = new Datum("31.12.1899");
		d.show();
		d.add(100);
		d.show();
		d.sub(100);
		d.show();
		d = new Datum("24.13.1947");
		d.show();
	}
	int tag, mon, jhr;


	int lftag;


	public Datum(int t, int m, int j)
	{
		setDatum(t, m, j);
	}


	public Datum(String d)
	{
		if (d.length() != 10)
			throw new DatumFalschException(d);

		try
		{
			String ts = d.substring(0, 2);
			String ms = d.substring(3, 5);
			String js = d.substring(6, 10);
			int tn = Integer.parseInt(ts);
			int mn = Integer.parseInt(ms);
			int jn = Integer.parseInt(js);
			setDatum(tn, mn, jn);
		}
		catch (Exception e)
		{
			throw new DatumFalschException(d);
		}
	}


	public void add()
	{
		lftag += 1;
		tag += 1;
		if (tag > letzter(mon, jhr))
		{
			tag = 1;
			mon += 1;
			if (mon > 12)
			{
				mon = 1;
				jhr += 1;
			}
		}
	}


	public void add(int i)
	{
		for (int x = 1; x < i; x++)
		{
			add();
		}
	}


	private String ed(int i)
	{
		if (i < 10)
			return "0" + i;
		else
			return "" + i;

	}


	private String getWochentag()
	{
		String[] tage = { "mo", "di", "mi", "do", "fr", "sa", "so" };
		return tage[(lftag + 4) % 7];
	}


	private int letzter(int m, int j)
	{
		if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10
				| m == 12)
			return 31;
		if (m == 4 || m == 6 || m == 9 || m == 11)
			return 30;

		if (schaltjahr(j))
			return 29;
		else
			return 28;
	}


	private boolean schaltjahr(int j)
	{
		if (j % 400 == 0)
			return true;
		if (j % 100 == 0)
			return false;
		if (j % 4 == 0)
			return true;
		return false;
	}


	private void setDatum(int t, int m, int j)
	{
		if (j < 1600 || j > 9999)
		{
			throw new JahrFalschException(j);
		}
		if (m < 1 || m > 12)
		{
			throw new MonatFalschException(m);
		}

		if (t < 1 || t > letzter(m, j))
		{
			throw new TagFalschException(t);
		}

		this.tag = t;
		this.mon = m;
		this.jhr = j;

		setLftag();
	}


	private void setLftag()
	{
		for (int j = 1600; j < this.jhr; j++)
		{
			if (schaltjahr(j))
				lftag += 366;
			else
				lftag += 365;
		}

		for (int m = 1; m < this.mon; m++)
		{
			lftag += letzter(m, this.jhr);
		}
		lftag += this.tag;
	}


	private void show()
	{
		System.out.println(ed(tag) + "." + ed(mon) + "." + jhr + "  "
				+ lftag + " " + getWochentag());
	}


	public void sub()
	{
		lftag -= 1;

		tag -= 1;

		if (tag < 1)
		{
			mon -= 1;

			if (mon < 1)
			{
				mon = 12;
				jhr -= 1;
			}

			tag = letzter(mon, jhr);
		}
	}


	public void sub(int i)
	{
		for (int x = 1; x < i; x++)
		{
			sub();
		}
	}
}



class DatumFalschException extends RuntimeException
{
	private static final long serialVersionUID = 1L;


	DatumFalschException(String d)
	{
		super("Datum ist falsch: " + d);
	}
}



class JahrFalschException extends RuntimeException
{
	private static final long serialVersionUID = 1L;


	JahrFalschException(int j)
	{
		super("Jahr ist falsch: " + j);
	}
}



class MonatFalschException extends RuntimeException
{
	private static final long serialVersionUID = 1L;


	MonatFalschException(int m)
	{
		super("Monat ist falsch: " + m);
	}
}



class TagFalschException extends RuntimeException
{
	private static final long serialVersionUID = 1L;


	TagFalschException(int t)
	{
		super("Tag ist falsch: " + t);
	}
}
