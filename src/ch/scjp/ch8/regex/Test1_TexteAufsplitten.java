package ch.scjp.ch8.regex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import ch.java_akademie.tools.MyTools;

public class Test1_TexteAufsplitten
{


	public static void main(String[] args) throws FileNotFoundException
	{
		textAufsplittenMitScanner(
				"Michael&bauer&sonnenweg 2&10000&berlin", "&");
		textAufsplittenMitScanner(
				"Michael bauer sonnenweg 2   10000  berlin", "\\s+");
		textAufsplittenMitScanner(
				"Michaelxxxbauerxsonnenweg 2xxxx10000xxberlin", "x+");

		textAufsplittenSplit("Michael&bauer&sonnenweg 2&10000&berlin",
				"&");
		textAufsplittenSplit(
				"Michael bauer sonnenweg 2   10000  berlin", "\\s+");
		textAufsplittenSplit(
				"Michaelxxxbauerxsonnenweg 2xxxx10000xxberlin", "x+");

		textAufsplittenSplit("dies...ist...ein...text", "\\.\\.\\.");
		textAufsplittenSplit("ein$$weiterer$$text", "\\$\\$");
	
		fileAufsplitten("temp/fileToSplit.txt", "\\s+");
		fileAufsplitten("temp/fileToSplit.txt", "\\.+");
		fileAufsplitten("temp/fileToSplit.txt", "xxx");
		fileAufsplitten("temp/fileToSplit.txt", "\\d+|\\.+|xxx|\\s+");
		// fileAufsplitten("temp/fileToSplit.txt","\\d*");

		textAufsplittenSplit("elf 11 zwoelf 12 dreizehn 13 ", " \\d\\d ");

	}


	private static void textAufsplittenMitScanner(String text,
			String delimiter)
	{
		String ueb = String.format(
				"Text aufsplitten mit Scanner: (%s), text=%s",
				delimiter, text);

		MyTools.uebOut(ueb, 2);

		Scanner scanner = new Scanner(text);
		scanner.useDelimiter(delimiter);

		while (scanner.hasNext())
		{
			System.out.println(scanner.next());
		}
		scanner.close();
	}


	private static void textAufsplittenSplit(String input,
			String regex)
	{
		String ueb = String.format(
				"Text aufsplitten mit Split: (%s), text=%s", regex,
				input);

		MyTools.uebOut(ueb, 2);

		String[] sa = input.split(regex);
		System.out.println(Arrays.toString(sa));
	}



	private static void fileAufsplitten(String file, String delimiter)
			throws FileNotFoundException
	{
		String ueb = String.format("File aufsplitten: (%s), file=%s",
				delimiter, file);

		MyTools.uebOut(ueb, 2);

		FileInputStream fis = new FileInputStream(file);

		Scanner sc = new Scanner(fis);

		sc.useDelimiter(delimiter);

		while (sc.hasNext())
		{
			System.out.println(sc.next());
		}

		sc.close();
	}

}
