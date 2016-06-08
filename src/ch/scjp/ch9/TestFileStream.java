package ch.scjp.ch9;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class TestFileStream
{
	public static void main(String[] args) throws Exception
	{
		test3();
		test2();
		test1();
	}


	private static void test1() throws Exception
	{
		// FileOutputStream fos = new
		// FileOutputStream("c:/temp/fos1.txt");
		//
		// byte[] ba = new byte[10000000];
		// for(int i=0; i<ba.length; i++)
		// {
		// ba[i]=(byte)i;
		// }
		//
		// fos.write(65);
		// fos.write(ba);
		//
		//
		// fos.close();

		FileInputStream fis = new FileInputStream("c:/temp/fos1.txt");
		// int erg=fis.read();
		// System.out.println("erg="+(char)erg);
		System.out.println(fis.available());
		byte[] ba = new byte[10];
		int anzahl = fis.read(ba);
		System.out.println("anzahl=" + anzahl);
		fis.close();
		System.out.println("programmende");
	}


	private static void test2() throws Exception
	{
		PrintStream ps = new PrintStream(new FileOutputStream(
				"c:/temp/ps.txt"));
		ps.println("zeile1");
		ps.println("zeile2");
		ps.println("zeile3");
		ps.close();

		BufferedReader br = new BufferedReader(new InputStreamReader(
				new FileInputStream("c:/temp/ps.txt")));

		String erg;
		while ((erg = br.readLine()) != null)
		{
			System.out.println(erg);
		}
		br.close();
	}


	private static void test3() throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(
				System.in));

		String s = br.readLine();
		System.out.println(s);
	}

}
