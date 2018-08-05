package ch.scjp.ch8.format;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

import ch.jmildner.tools.MyTools;


public class Test5_NumberFormatterTest
{
	private static Locale ch = new Locale("de", "CH");
	private static Locale[] lo = { ch, Locale.US, Locale.UK,
			Locale.GERMANY };
	private static String[] zahl = { "123'234.567", "123,234.567",
			"123,234.567", "123.234,567" };

	private static String[] waehrung = { "SFr. 111'156'781.25",
			"$56,781.25", "�56,781.25", "56.781,25 �" };


	public static void main(String[] args) throws ParseException
	{
		formatNumber();
		formatCurrency();
		parseNumber();
		parseCurrency();
	}


	private static void formatCurrency()
	{
		MyTools.uebOut("Format Currency", 3);

		for (Locale l : lo)
		{
			NumberFormat f = NumberFormat.getCurrencyInstance(l);
			String s = f.format(123456781.254756);
			System.out.printf("%s / %s %n", s, l.getDisplayCountry());
		}
	}


	private static void formatNumber()
	{
		MyTools.uebOut("Format Number", 3);

		for (Locale l : lo)
		{
			NumberFormat f = NumberFormat.getInstance(l);
			String s = f.format(1234781.254756);
			System.out.printf("%s / %s %n", s, l.getDisplayCountry());
		}
	}


	private static void parseNumber() throws ParseException
	{
		MyTools.uebOut("Parse Number", 3);

		for (int i = 0; i < lo.length; i++)
		{
			NumberFormat nf = NumberFormat.getInstance(lo[i]);

			Number n = nf.parse(zahl[i]);
			System.out.printf("%s / %s %n", n,
					lo[i].getDisplayCountry());
		}
	}


	private static void parseCurrency() throws ParseException
	{
		MyTools.uebOut("Parse Currency", 3);

		for (int i = 0; i < lo.length; i++)
		{
			NumberFormat nf = NumberFormat.getCurrencyInstance(lo[i]);

			Number n = nf.parse(waehrung[i]);
			double d = n.doubleValue();
			System.out.printf("%s / %f / %s %n", n, d,
					lo[i].getDisplayCountry());
		}
	}
}
