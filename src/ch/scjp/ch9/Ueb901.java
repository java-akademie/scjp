package ch.scjp.ch9;

import java.io.File;
import java.io.IOException;

public class Ueb901
{

	public static void main(String[] args) throws IOException
	{
		new Ueb901().start();
	}


	private void start()
	{
		File dir = new File("temp");
		File dir2 = new File("temp2");

		System.out.println(dir.delete());

		System.out.println(dir2.delete());
		System.out.println(dir2.delete());
		System.out.println(dir2.mkdir());
		System.out.println(dir2.mkdir());

		System.out.println(dir2.renameTo(dir));
	}
}
