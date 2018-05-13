package ch.scjp.ch8.format;

import java.text.ParseException;
import java.util.Formatter;
import java.util.Locale;

import ch.jmildner.tools.MyTools;

public class Test2_FormatierungTextUndZahlen
{

	public static void main(String[] args) throws ParseException
	{
		Locale Locale_SWISS_DE = new Locale("de", "CH");
		Locale Locale_AUSTRIA = new Locale("de", "AT");
		Locale Locale_UNGUELTIG = new Locale("--", "--");
		Locale Locale_ENGLISH = new Locale("en");

		formatierenVonTextUndZahlen(Locale_SWISS_DE);
		formatierenVonTextUndZahlen(Locale.GERMANY);
		formatierenVonTextUndZahlen(Locale.GERMAN);
		formatierenVonTextUndZahlen(Locale.US);
		formatierenVonTextUndZahlen(Locale.UK);
		formatierenVonTextUndZahlen(Locale_ENGLISH);
		formatierenVonTextUndZahlen(new Locale("de", "AT"));
		formatierenVonTextUndZahlen(Locale.ITALIAN);
		formatierenVonTextUndZahlen(Locale.ITALY);
		formatierenVonTextUndZahlen(Locale_UNGUELTIG);
		formatierenVonTextUndZahlen(Locale_AUSTRIA);

		formatierenMitFormatter(Locale.GERMANY);
		formatierenMitFormatter(Locale.US);
		formatierenMitFormatter(Locale.UK);
		formatierenMitFormatter(Locale_SWISS_DE);
		formatierenMitFormatter(Locale_UNGUELTIG);
	}


	private static void formatierenVonTextUndZahlen(Locale... locale)
	{
		ueb("Text und Zahlen formatieren", 3, locale);

		String text = "dies ist der Text";
		Integer intZahl1 = 2122122321;
		Double dblZahl1 = 232224112.549;
		Integer intZahl2 = -234223221;
		Double dblZahl2 = -1222223432.549;

		String s;
		s = String
				.format("der Text rechts in der Laenge 40 und die intZahl text=%40s  intZahl=%d",
						text, intZahl1);
		System.out.println(s);

		s = String
				.format("der Text links  in der Laenge 40 und die intZahl text=%-40s  intZahl=%d",
						text, intZahl1);
		System.out.println(s);

		s = String
				.format("der Text links  Grossbuchstaben  und die intZahl text=%-40S  intZahl=%d",
						text, intZahl1);
		System.out.println(s);

		s = String
				.format("die zahlen 22 breit mit Tausendertrenner           %,22d %,22f   %,22d %,22f",
						intZahl1, dblZahl1, intZahl2, dblZahl2);
		System.out.println(s);

		s = String
				.format("die zahlen 22 breit mit TT und nur 2 Kommastellen  %,22d %,22.2f   %,22d %,22.2f",
						intZahl1, dblZahl1, intZahl2, dblZahl2);
		System.out.println(s);

		s = String
				.format("die zahlen mit TT und VZ   und nur 2 Kommastellen  %+,22d %+,22.2f   %+,22d %+,22.2f",
						intZahl1, dblZahl1, intZahl2, dblZahl2);
		System.out.println(s);

		s = String
				.format("die zahlen links mit TT    und nur 2 Kommastellen  %-,22d %-,22.2f   %-,22d %-,22.2f",
						intZahl1, dblZahl1, intZahl2, dblZahl2);
		System.out.println(s);

		s = String
				.format("die zahlen links mit TT und VZ nur 2 Kommastellen  %+-,22d %+-,22.2f   %+-,22d %+-,22.2f",
						intZahl1, dblZahl1, intZahl2, dblZahl2);
		System.out.println(s);

	}


	private static void formatierenMitFormatter(Locale... locale)
	{
		ueb("Formatieren mit Formatter", 3, locale);

		StringBuilder buffer = new StringBuilder();
		Formatter f = new Formatter(buffer);
		double a = 1123.567;
		double b = 323456.159;
		Object[] objekte = { a, b, (a * b) };
		f.format("%,.2f * %,.2f = %,.3f", objekte);
		System.out.println(buffer);

		System.out.format("PI=%.15f \n", Math.PI);
		f.close();
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
