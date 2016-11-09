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



		textAufsplittenMitScanner();
		textAufsplittenSplit();
		fileAufsplitten();
	}



	private static void textAufsplittenSplit()
	{
		textAufsplittenMitSplit("Michael&bauer&sonnenweg 2&10000&berlin", "&");
		textAufsplittenMitSplit("Michael bauer sonnenweg 2   10000  berlin", "\\s+");
		textAufsplittenMitSplit("Michaelxxxbauerxsonnenweg 2xxxx10000xxberlin", "x+");

		textAufsplittenMitSplit("dies...ist...ein...text", "\\.\\.\\.");
		textAufsplittenMitSplit("ein$$weiterer$$text", "\\$\\$");


		textAufsplittenMitSplit("elf    11    zwoelf    12   dreizehn  13   ", " \\d\\d ");
		textAufsplittenMitSplit("elf    11    zwoelf    12   dreizehn  13   ", " +\\d\\d +");
	}


	private static void textAufsplittenMitSplit(String input, String regex)
	{
		String ueb = String.format("Text aufsplitten mit Split: regex='%s', input='%s'", regex,
				input);

		MyTools.uebOut(ueb, 2);

		String[] sa = input.split(regex);
		System.out.println(sa.length);
		System.out.println(Arrays.toString(sa));
	}


	private static void fileAufsplitten() throws FileNotFoundException
	{
		fileAufsplitten("temp/fileToSplit.txt", "\\s+");
		fileAufsplitten("temp/fileToSplit.txt", "\\.+");
		fileAufsplitten("temp/fileToSplit.txt", "xxx");
		fileAufsplitten("temp/fileToSplit.txt", "\\d+\\.+\\s+|\\d+\\.+|xxx|\\s+");

		fileAufsplitten("temp/fileToSplit.txt", "keinSplit");
	}


	private static void fileAufsplitten(String file, String regex) throws FileNotFoundException
	{
		String ueb = String.format("File aufsplitten: regex='%s', file='%s'", regex, file);

		MyTools.uebOut(ueb, 2);

		FileInputStream fis = new FileInputStream(file);

		Scanner sc = new Scanner(fis);

		sc.useDelimiter(regex);

		while (sc.hasNext())
		{
			System.out.println(sc.next());
		}

		sc.close();
	}



	private static void textAufsplittenMitScanner()
	{
		textAufsplittenMitScanner("Michael&bauer&sonnenweg 2&10000&&&berlin", "&");
		textAufsplittenMitScanner("Michael&bauer&sonnenweg 2&10000&&&berlin", "&+");
		textAufsplittenMitScanner("Michael bauer sonnenweg 2   10000  berlin", "\\s+");
		textAufsplittenMitScanner("Michaelxxxbauerxsonnenweg 2xxxx10000xxberlin", "x+");
	}


	private static void textAufsplittenMitScanner(String input, String regex)
	{
		String ueb = String.format("Text aufsplitten mit Scanner: regex='%s', input='%s'", regex,
				input);

		MyTools.uebOut(ueb, 2);

		Scanner scanner = new Scanner(input);
		scanner.useDelimiter(regex);

		while (scanner.hasNext())
		{
			System.out.println(scanner.next());
		}

		scanner.close();
	}

}
