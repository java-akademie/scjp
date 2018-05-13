package ch.scjp.ch8.format;

import java.text.ParseException;
import java.util.Locale;
import java.util.TimeZone;

import ch.jmildner.tools.MyTools;

public class Test1_TimeZoneAndLocale
{
	public static void main(String[] args) throws ParseException
	{
		 testTimeZone();
		//testLocale();
	}


	private static void testTimeZone()
	{
		ueb("TimeZone's", 3);

		String[] timeZoneId = TimeZone.getAvailableIDs();

		System.out.printf("es gibt %d ZeitZonen %n", timeZoneId.length);
		for (int i = 0; i < timeZoneId.length; i++)
		{
			if (i % 100 == 0)
			{
			//	TimeZone tz = ZoneInfo.getTimeZone(timeZoneId[i]);
			//	System.out.println(tz);
				System.out.println(timeZoneId[i]);
			}
		}

		ueb("default TimeZone", 2);
		System.out.println(TimeZone.getDefault());

	}


	static void testLocale()
	{
		int z = 0;

		ueb("default Locale", 3);
		Locale defaultLocale = Locale.getDefault();
		System.out.println(defaultLocale);



		ueb("available Locales", 2);
		Locale[] availableLocales = Locale.getAvailableLocales();
		for (int i = 0; i < availableLocales.length; i++)
		{
			if (i % 1 == 0)
			{
				Locale locale = availableLocales[i];
				System.out.printf("%35s: %2s %2s / %s %n",
						locale.getDisplayCountry(), locale.getCountry(),
						locale.getLanguage(), locale);
			}
		}



		ueb("available ISO Countries", 2);
		z = 0;
		for (String iso : Locale.getISOCountries())
		{
			if (z++ % 1 == 0)
				System.out.println(iso);
		}


		ueb("available ISO Languages", 2);
		z = 0;
		for (String iso : Locale.getISOLanguages())
		{
			if (z++ % 1 == 0)
				System.out.println(iso);
		}



		ueb("eigene Locale setzen", 2);
		final Locale SWISS_DE = new Locale("de", "CH");
		Locale.setDefault(SWISS_DE);
		System.out.println(Locale.getDefault());

		final Locale AUSTRIA = new Locale("de", "AT");
		System.out.println(AUSTRIA);


		ueb("vordefiniert Locale", 2);
		System.out.printf("GERMAN  %s %n", Locale.GERMAN);
		System.out.printf("GERMANY %s %n", Locale.GERMANY);
		System.out.printf("FRENCH  %s %n", Locale.FRENCH);
		System.out.printf("FRANCE  %s %n", Locale.FRANCE);
		System.out.printf("ITALIAN %s %n", Locale.ITALIAN);
		System.out.printf("ITALY   %s %n", Locale.ITALY);
		System.out.printf("UK      %s %n", Locale.UK);
		System.out.printf("US      %s %n", Locale.US);
		System.out.printf("ENGLISH %s %n", Locale.ENGLISH);
	}


	private static void ueb(String text, int zeilen, Locale... locale)
	{
		if (locale.length == 1)
		{
			MyTools.uebOut(text + " " + locale[0], zeilen);
			Locale.setDefault(locale[0]);
		}
		else
		{
			MyTools.uebOut(text + " " + Locale.getDefault(), zeilen);
		}
	}
}
