package ch.scjp.ch2;

public class Flags
{
	private int flags;


	public Flags()
	{
	}


	public Flags(int flags)
	{
		this.flags = flags;
	}


	public Flags(String flags)
	{

		for (int i = 0; i < Math.min(flags.length(), 32); i++)
		{
			if (flags.substring(i, i + 1).equals("1"))
			{
				setFlag(32 - i);
			}
		}
	}


	public void deleteFlag(int pos)
	{
		if (issetFlag(pos))
		{
			int f = 1;
			f = f << (pos - 1);
			flags = flags ^ f;
		}
	}


	public int getFlags()
	{
		return flags;
	}


	public boolean issetFlag(int pos)
	{
		Flags f = new Flags();
		f.setFlag(pos);

		if ((this.getFlags() & f.getFlags()) == f.getFlags())
		{
			return true;
		}
		else
		{
			return false;
		}
	}


	public void setFlag(int pos)
	{
		int f = 1;
		f = f << (pos - 1);
		flags = flags | f;
	}


	public void show()
	{
		System.out.println(this.toString());
	}


	@Override
	public String toString()
	{

		String s = Integer.toBinaryString(flags);

		while (s.length() < 32)
		{
			s = "0" + s;
		}

		s = "B'" + s + "' " + flags;

		return s;
	}

}
