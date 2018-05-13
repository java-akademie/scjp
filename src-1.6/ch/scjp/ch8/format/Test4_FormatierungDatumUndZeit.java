package ch.scjp.ch8.format;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import ch.jmildner.tools.MyTools;

public class Test4_FormatierungDatumUndZeit
{


	public static void main(String[] args)
	{
		Locale Locale_SWISS_DE = new Locale("de", "CH");
		Locale Locale_UNGUELTIG = new Locale("--", "--");

		formatDate(Locale_SWISS_DE);
		formatDate(Locale.GERMANY);
		formatDate(Locale.GERMAN);
		formatDate(Locale.US);
		formatDate(Locale.UK);
		formatDate(Locale_UNGUELTIG);

		formatTime(Locale_SWISS_DE);
		formatTime(Locale.UK);
		formatTime(Locale.US);
		formatTime(Locale.GERMANY);

		formatDateTime(Locale.GERMANY);


		formatCalendar(makeDate(2001, 11, 13, 11, 11, 11));

	}



	private static void formatCalendar(Date makeDate)
	{
		ueb("Calendar formatieren", 3);

		Calendar c1 = new GregorianCalendar(1973, 3 - 1, 12);
		Calendar c2 = new GregorianCalendar(1985, 9 - 1, 2);
		System.out.printf("%te. %<tb %<ty, %2$te. %<tb %<ty%n", c1, c2); 
		System.out.printf("%1$te. %1$tb %1$ty, %2$te. %2$tb %2$ty %n", c1, c2); 
	}



	private static void formatDateTime(Locale... locale)
	{
		ueb("Date Time formatieren", 3, locale);

		String[] formatX = { "FULL", "LONG", "MEDIUM", "SHORT" };
		int[] formatD = { DateFormat.FULL, DateFormat.LONG,
				DateFormat.MEDIUM, DateFormat.SHORT };

		DateFormat df;
		Date d = makeDate(2001, 11, 11, 11, 11, 11);

		for (int format : formatD)
		{
			df = DateFormat.getDateTimeInstance(format, format);
			System.out.printf("%s %-6S  %s  \n", d, formatX[format],
					df.format(d));
		}
	}


	private static void formatTime(Locale... locale)
	{
		ueb("Time formatieren", 3, locale);

		String[] formatX = { "FULL", "LONG", "MEDIUM", "SHORT" };
		int[] formatD = { DateFormat.FULL, DateFormat.LONG,
				DateFormat.MEDIUM, DateFormat.SHORT };

		DateFormat df;
		Date d = makeDate(2001, 11, 11, 11, 11, 11);

		for (int format : formatD)
		{
			df = DateFormat.getTimeInstance(format);
			System.out.printf("%s %-6S  %s  \n", d, formatX[format],
					df.format(d));
		}
	}



	private static void formatDate(Locale... locale)
	{
		ueb("Date formatieren", 3, locale);

		String[] formatX = { "FULL", "LONG", "MEDIUM", "SHORT" };
		int[] formatD = { DateFormat.FULL, DateFormat.LONG,
				DateFormat.MEDIUM, DateFormat.SHORT };

		DateFormat df;
		Date date = makeDate(2013, 10, 24, 19, 32, 15);

		for (int dateFormat : formatD)
		{
			df = DateFormat.getDateInstance(dateFormat);
			System.out.printf("%s %-6S  %s  \n", date,
					formatX[dateFormat], df.format(date));
		}
	}


	private static Date makeDate(int year, int month, int day,
			int hour, int min, int sec)
	{
		Calendar calendar = new GregorianCalendar(year, month - 1, day,
				hour, min, sec);

		Date date = new Date(calendar.getTimeInMillis());

		return date;
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
