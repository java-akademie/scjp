package ch.scjp.ch9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class IOTest2
{

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws Exception
	{
		// test1();
		test2();
	}


	@SuppressWarnings("unused")
	private static void test1() throws IOException
	{
		File f = new File("/");
		String[] l = f.list();
		System.out.println(Arrays.toString(l));
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());

		File f1 = new File("/neuesverzeichnis/temp.txt");
		f1.createNewFile();
	}


	private static void test2() throws Exception
	{
		FileOutputStream fos = new FileOutputStream("/temp/zwi.txt");

		fos.write(2000000123);
		fos.close();

		FileInputStream fis = new FileInputStream("/temp/zwi.txt");

		int i = fis.read();
		fis.close();

		System.err.println("das ergebnis: " + (char) i);
	}

}
