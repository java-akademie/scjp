package ch.scjp.ch9;

import java.io.File;
import java.io.RandomAccessFile;

public class TestRandomAccessFile
{
	public static void main(String[] args) throws Exception
	{
		File verzeichnis = new File("c:/temp");
		File file = new File(verzeichnis, "raf.txt");
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		byte[] ba = { 65, 66, 67, 68 };
		raf.write(65); // 0
		raf.write(ba); // 1,4
		raf.write(ba, 1, 2); // 5,2

		raf.writeBoolean(false); // 7
		raf.writeLong(1000L);
		raf.writeUTF("aaa");
		raf.writeUTF("bbbb");

		long cpos = raf.getFilePointer();
		raf.writeUTF("ccccc");

		raf.close();

		RandomAccessFile rr = new RandomAccessFile(file, "r");

		rr.seek(7);
		boolean b = rr.readBoolean();
		System.out.println("b=" + b);
		long l = rr.readLong();
		System.out.println("l=" + l);
		rr.seek(cpos);
		String s = rr.readUTF();
		System.out.println("s=" + s);

		rr.close();

		System.out.println("programmende");


	}
}
