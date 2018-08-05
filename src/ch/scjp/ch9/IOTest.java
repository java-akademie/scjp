package ch.scjp.ch9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class IOTest
{

	private static void lesen() throws Exception
	{
		FileReader fr = new FileReader("test.txt");
		BufferedReader br = new BufferedReader(fr);
		String s = br.readLine();
		System.out.println(s);
		br.close();

	}


	private static void lesenVonConsole() throws Exception
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		System.out.println(s);
		br.close();

	}


	public static void main(String[] args) throws Exception
	{
		schreiben();
		lesen();
		lesenVonConsole();
	}


	private static void schreiben() throws Exception
	{
		FileWriter fw = new FileWriter("test.txt");
		PrintWriter w = new PrintWriter(fw);
		w.println("hugo");
		w.println("fritz\n");
		w.close();

	}
}
