package ch.scjp.ch9;

import java.io.EOFException;
import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Pers1 implements Serializable
{

	private static final long serialVersionUID = 1L;
	String name;


	Pers1(String name)
	{
		this.name = name;
	}


	void show()
	{
		System.out.println(name);
	}

}



class Pers2 implements Serializable
{

	private static final long serialVersionUID = 1L;
	String name;


	Pers2(String name)
	{
		this.name = name;
	}


	private void readObject(ObjectInputStream ois) throws Exception
	{
		String passwort = ois.readUTF();
		if (!passwort.equals("geheim"))
		{
			throw new SecurityException("bad password");
		}
		ois.defaultReadObject();
	}


	void show()
	{
		System.out.println(name);
	}


	private void writeObject(ObjectOutputStream oos) throws Exception
	{
		oos.writeUTF("geheim");
		oos.defaultWriteObject();
	}
}



class Pers3 implements Externalizable
{

	private static final long serialVersionUID = 1L;
	String name;


	public Pers3()
	{

	}


	Pers3(String name)
	{
		this.name = name;
	}


	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException
	{
		System.out.println("readExternal");
		name = in.readUTF();
	}


	void show()
	{
		System.out.println(name);
	}


	@Override
	public void writeExternal(ObjectOutput out) throws IOException
	{
		System.out.println("writeExternal");
		out.writeUTF(name);
	}
}



public class Ueb909
{



	public static void main(String[] args) throws Exception
	{
		new Ueb909().start();
	}


	private void start() throws Exception
	{
		test3();
		test2();
		test1();
	}


	private void test1() throws Exception
	{
		System.out.println("\n\ntest2");


		String filename = "pers9091.ser";

		{
			Pers1 p1 = new Pers1("hugo");
			Pers1 p2 = new Pers1("max");

			ObjectOutput oos = new ObjectOutputStream(
					new FileOutputStream(filename));
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.close();
		}


		{
			ObjectInput ois = new ObjectInputStream(
					new FileInputStream(filename));

			while (true)
			{
				try
				{
					Pers1 p = (Pers1) ois.readObject();
					p.show();
				}
				catch (EOFException e)
				{
					break;
				}
				catch (Exception e)
				{
					e.printStackTrace();
					break;
				}
			}

			ois.close();
		}
	}


	private void test2() throws Exception
	{
		System.out.println("\n\ntest1");

		String filename = "pers9092.ser";

		{
			Pers2 p1 = new Pers2("fritz");
			Pers2 p2 = new Pers2("gerd");

			ObjectOutput oos = new ObjectOutputStream(
					new FileOutputStream(filename));
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.close();
		}


		{
			ObjectInput ois = new ObjectInputStream(
					new FileInputStream(filename));

			while (true)
			{
				try
				{
					Pers2 p = (Pers2) ois.readObject();
					p.show();
				}
				catch (EOFException e)
				{
					break;
				}
				catch (Exception e)
				{
					e.printStackTrace();
					break;
				}
			}

			ois.close();
		}
	}


	private void test3() throws Exception
	{
		System.out.println("\n\ntest3");

		String filename = "pers9093.ser";

		{
			Pers3 p1 = new Pers3("horst");
			Pers3 p2 = new Pers3("urs");


			ObjectOutput oos = new ObjectOutputStream(
					new FileOutputStream(filename));
			oos.writeObject(p1);
			oos.writeObject(p2);

			oos.close();
		}


		{
			ObjectInput ois = new ObjectInputStream(
					new FileInputStream(filename));

			while (true)
			{
				try
				{
					Pers3 p = (Pers3) ois.readObject();
					p.show();
				}
				catch (EOFException e)
				{
					break;
				}
				catch (Exception e)
				{
					e.printStackTrace();
					break;
				}
			}

			ois.close();
		}
	}



}
