package ch.scjp.ch8.regex;

import java.io.FileNotFoundException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ch.jmildner.tools.MyTools;

public class Test4_PruefenVonZeichenketten
{
	public static void main(String[] args) throws FileNotFoundException
	{
		MyTools.uebOut(
				"PASST EINE ZEICHENKETTE KOMPLETT AUF EIN MUSTER", 3);

		passtEineZeichenfolgeKomplettAufEinMuster(
				"3 Stellen numerisch", "123", "^\\d\\d\\d$");

		passtEineZeichenfolgeKomplettAufEinMuster(
				"3 Stellen numerisch", "1.3", "^\\d\\d\\d$");



		passtEineZeichenfolgeKomplettAufEinMuster("Datumscheck",
				"24-10-1947", "^(\\d{2})-(\\d{2})-(\\d{4})$");

		passtEineZeichenfolgeKomplettAufEinMuster("Datumscheck",
				"24.10.1947", "^(\\d{2})-(\\d{2})-(\\d{4})$");



		passtEineZeichenfolgeKomplettAufEinMuster("9.99", "1.20",
				"^\\d\\.\\d\\d$");

		passtEineZeichenfolgeKomplettAufEinMuster("9.99", "1,20",
				"^\\d\\.\\d\\d$");


		passtEineZeichenfolgeKomplettAufEinMuster("n99n99n", "a12b13c",
				"^[a-z]\\d\\d[a-z]\\d\\d[a-z]$");

		passtEineZeichenfolgeKomplettAufEinMuster("n99n99n", "a12B13c",
				"^[a-z]\\d\\d[a-z]\\d\\d[a-z]$");


		datumsCheck("24-10-2000");
		datumsCheck("29-02-2001");
		datumsCheck("29-02-2000");
	}


	private static void passtEineZeichenfolgeKomplettAufEinMuster(
			String test, String input, String regex)
	{
		MyTools.uebOut(test, 2);

		System.out.printf("Input=[%s] regex=[%s] %n", input, regex);

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(input);

		System.out.println(m.matches());

		// oder Fassade

		System.out.println(Pattern.matches(regex, input));
	}


	private static void datumsCheck(String datum)
	{
		MyTools.uebOut("datumCheck " + datum, 3);

		String regex = "^(\\d{2})-(\\d{2})-(\\d{4})$";

		if (!Pattern.matches(regex, datum))
		{
			System.out.println("datum NOK");
			return;
		}

		String[] arr = datum.split("-");

		int tt = Integer.parseInt(arr[0]);
		int mm = Integer.parseInt(arr[1]);
		int jj = Integer.parseInt(arr[2]);

		int[] ml = { 31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (jj % 400 == 0)
			ml[2] = 29;
		else
			if (jj % 100 == 0)
				ml[2] = 28;
			else
				if (jj % 4 == 0)
					ml[2] = 29;
				else
					ml[2] = 28;

		if (mm >= 1 && mm <= 12 && tt >= 1 && tt <= ml[mm])
			System.out.println("datum OK");
		else
			System.out.println("datum NOK");
	}

}
