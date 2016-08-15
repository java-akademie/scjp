package ch.scjp.ch8.regex;

import java.io.FileNotFoundException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ch.java_akademie.tools.MyTools;

public class Test3_FindenVonTeilstrings
{
	public static void main(String[] args) throws FileNotFoundException
	{
		MyTools.uebOut("FINDEN VON TEILSTRINGS", 3);

		findenVonTeilstrings(
				"3 Ziffern am Anfang",
				"123 ist der erste Betrag, der zweite ist 456, der letzte ist 789",
				"^\\d{3}");

		findenVonTeilstrings(
				"3 Ziffern am Ende",
				"123 ist der erste Betrag, der zweite ist 456, der letzte ist 789",
				"\\d{3}$");

		findenVonTeilstrings(
				"3 Ziffern irgendwo",
				"123 ist der erste Betrag, der zweite ist 456, der letzte ist 789",
				"\\d{3}");


		findenVonTeilstrings(
				"Datum am Anfang",
				"12.02.1999 ist das erste Datum, das zweite ist 31.05.2007, das letzte ist 25.15.2013",
				"^(\\d{2})\\.(\\d{2})\\.(\\d{4})");

		findenVonTeilstrings(
				"Datum am Ende",
				"12.02.1999 ist das erste Datum, das zweite ist 31.05.2007, das letzte ist 25.15.2013",
				"(\\d{2})\\.(\\d{2})\\.(\\d{4})$");

		findenVonTeilstrings(
				"Datum igendwo",
				"12.02.1999 ist das erste Datum, das zweite ist 31.05.2007, das letzte ist 25.15.2013",
				"(\\d{2})\\.(\\d{2})\\.(\\d{4})");


		findenVonTeilstrings(
				"Die Fett geschriebenen Text - greedy=gierig *",
				"Echt <b>fett</b> der text, <b>cool</b>", "<b>.*</b>");

		findenVonTeilstrings(
				"Die Fett geschriebenen Texte - reluctant=zurueckhaltend ?",
				"Echt <b>fett</b> der text, <b>cool</b>", "<b>.*?</b>");

		findenVonTeilstrings(
				"aaa",
				"javax.persistence.Entity(name=hugo)", "\\(name=[.*?]\\)");

		findenVonTeilstrings(
				"Test Annotation",
				"javax.persistence.Entity(name=xyz)", "^javax.persistence.Entity(name=.*?)$");
	}


	private static void findenVonTeilstrings(String test, String input,
			String regex)
	{
		MyTools.uebOut(test, 2);

		System.out.printf("Input=[%s] regex=[%s] %n", input, regex);

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(input);

		while (m.find())
		{
			System.out.printf(
					"Position=[%2d/%2d]  gefundener Wert=[%s] %n",
					m.start(), m.end(), m.group());
		}
	}



}
