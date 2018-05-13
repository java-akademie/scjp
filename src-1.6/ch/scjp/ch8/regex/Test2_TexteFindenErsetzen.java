package ch.scjp.ch8.regex;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ch.jmildner.tools.MyTools;

public class Test2_TexteFindenErsetzen
{


	public static void main(String[] args) throws FileNotFoundException
	{
		findAll("name=hugo;alter=25;adresse=basel", "\\w+=\\w+");

		findAll("gewicht=23;alter=44;hoehe=12;laenge=7", "\\w+=\\d+");


		replaceAll("diesen scheiss will ich nicht hoeren, leck mich, fuck you",
				"scheiss|fuck|leck mich", "pieps");
		replaceAll("du kannst mich mal am arsch lecken", "arsch|fuck|leck mich", "pieps");


		findSchluesselwertpaare();

		
		findInLine("@javax.persistence.Entity(name=Person2tc3)",
				"@javax\\.persistence\\.Entitiy\\(name=(\\w+)\\)");

		findInLine("Michael Bauer Sonnenweg 2 10000 Berlin", "(\\w+ 2) (\\d+ Berlin)");

		findInLine("Michael Bauer Sonnenweg 2 10000 Berlin", "(Bauer \\w+ 2) (\\d+ Berlin)");

		findInLine("Michael Bauer Sonnenweg 2 10000 Berlin",
				"Michael Bauer (\\w+) 2 (\\d+) Berlin");
	}


	private static void replaceAll(String input, String regex, String replacement)
	{
		String ueb = String.format("replaceAll: (%s), text=%s", regex, input);

		MyTools.uebOut(ueb, 2);

		Pattern pa = Pattern.compile(regex);
		Matcher ma = pa.matcher(input);

		System.out.println(ma.replaceAll(replacement));

	}


	private static void findAll(String input, String regex)
	{
		String ueb = String.format("findAll: (%s), text=%s", regex, input);

		MyTools.uebOut(ueb, 2);

		Pattern pa = Pattern.compile(regex);
		Matcher ma = pa.matcher(input);

		while (ma.find())
		{
			String[] a = ma.group().split("=");
			System.out.println(Arrays.toString(a));
		}

	}


	private static void findSchluesselwertpaare()
	{
		MyTools.uebOut("Schluesselwertpaare", 3);

		String input = "name=hugo plz=1000 ort=berlin strasse=sonnenstrasse hausnummer=2";

		Scanner s = new Scanner(input);

		showKeyAndValue(s, "name=");
		showKeyAndValue(s, "plz=");
		showKeyAndValue(s, "ort=");
		showKeyAndValue(s, "strasse=");
		showKeyAndValue(s, "hausnummer=");
		showKeyAndValue(s, "alter=");

		s.close();
	}



	private static void showKeyAndValue(Scanner s, String key)
	{
		s.findInLine(key);

		String k = "[" + key.substring(0, key.length() - 1) + "]";

		if (s.hasNext())
			System.out.printf("Key=%-16s Value=[%s] %n", k, s.next());
		else
			System.out.printf("Key=%-16s Value=[%s] %n", k, "Key N/A");
	}


	private static void findInLine(String text, String regex)
	{
		String ueb = String.format("Find in Line: (%s), text=%s", regex, text);

		MyTools.uebOut(ueb, 2);

		Scanner sc = new Scanner(text);
		sc.findInLine(regex);

		// if(sc.hasNextLine()) ; else return;
		try
		{
			MatchResult mr = sc.match();

			sc.close();

			for (int i = 0; i <= mr.groupCount(); i++)
			{
				System.out.println("i=" + i + " " + mr.group(i));
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
