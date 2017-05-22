package ch.scjp.ch9;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Ueb92
{

	public static void main(String[] args) throws IOException
	{
		test1();
		test2();
	}


	static void test1() throws IOException
	{
		RandomAccessFile raf = new RandomAccessFile("test.txt", "rw");
		for (int i = 0; i < 1000; i++)
		{
			raf.writeBytes("" + i + "\n");
		}
		raf.close();
	}


	static void test2()
	{
		File f = new File("c:\\temp", "myfiles\\xyz");
		File f1 = new File(f, "aaa");

		if (f1.exists())
		{
			System.out.println("hugo exists");
		}
		else
		{
			System.out.println("hugo does not exist");
			try
			{
				f1.mkdir();
				// f1.createNewFile();
			}
			catch (Exception e)
			{
				System.out.println("xxx " + e);
			}
		}
	}


}
