package ch.scjp.ch8.format;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import ch.java_akademie.tools.MyTools;

public class Test3_ParseDateTime
{

	public static void main(String[] args) throws ParseException
	{
		Locale Locale_SWISS_DE = new Locale("de", "CH");
		Locale Locale_UNGUELTIG = new Locale("--", "--");

		parseDate("28.04.2009", Locale_SWISS_DE);
		parseDate("04/24/2009", Locale.US);
		parseDate("24/12/2009", Locale.UK);

		makeDatum(24, 13, 2013, Locale_SWISS_DE);
		makeDatum(24, 10, 2013, Locale.UK);
		makeDatum(24, 10, 2013, Locale.US);
		makeDatum(24, 10, 2013, Locale_UNGUELTIG);
	}


	private static void makeDatum(int dd, int mm, int yy,
			Locale... locale)
	{
		ueb("make Datum", 3, locale);

		Calendar calendar = Calendar.getInstance();
		calendar.set(yy, mm - 1, dd, 0, 0, 0);

		Date date = new Date(calendar.getTimeInMillis());

		System.out.println(date);


		System.out.printf("%1$td.%1$tm.%1$tY %n", calendar);
		System.out.printf("%1$td. %1$tb %1$tY %n", calendar);
		System.out.printf("%1$td. %1$tB %1$tY %n", calendar);
	}


	private static void parseDate(String datum, Locale... locale)
			throws ParseException
	{
		ueb("Parse Date", 3, locale);

		DateFormat dateFormat = DateFormat
				.getDateInstance(DateFormat.SHORT);
		Date date = dateFormat.parse(datum);
		System.out.println(date);
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
