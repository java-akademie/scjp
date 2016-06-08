package ch.scjp.ch6;

public enum Ampel
{
	rot
	{
		@Override
		public String toString()
		{
			return "stehenbleiben";
		}
	},
	orange
	{
		@Override
		public String toString()
		{
			return "warten";
		}
	},
	gruen
	{
		@Override
		public String toString()
		{
			return "laufen";
		}
	};

	public static void main(String... args)
	{
		for (Ampel a : Ampel.values())
		{
			System.out.println(a);
		}
	}
}
