package ch.scjp.ch9;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TestSerializable extends Thread implements Serializable
{
	private static final long serialVersionUID = 1L;


	public void run()
	{
		System.out.println("xxx");
	}


	public static void main(String[] args) throws Exception
	{
		System.out.println("Start ");

		TestSerializable th = new TestSerializable();



		FileOutputStream fs;
		ObjectOutputStream os;
		fs = new FileOutputStream("thread.ser");
		os = new ObjectOutputStream(fs);
		os.writeObject(th);
		os.close();
		fs.close();

	}

}
