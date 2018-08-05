package ch.scjp.ch3.uebungen;

public class Ueb3011
{
	public static void main(String[] args)
	{
		Ueb3011 u = new Ueb3011();
		u.privShow();
		u.frdlShow();
		u.protShow();
		u.publShow();
	}
	private String priv = "private";
	String frdl = "default";
	protected String prot = "protected";


	public String publ = "public";


	void frdlShow()
	{
		System.out.println("default:");
		System.out.println(priv);
		System.out.println(frdl);
		System.out.println(prot);
		System.out.println(publ);
	}


	private void privShow()
	{
		System.out.println("private:");
		System.out.println(priv);
		System.out.println(frdl);
		System.out.println(prot);
		System.out.println(publ);
	}


	protected void protShow()
	{
		System.out.println("protected:");
		System.out.println(priv);
		System.out.println(frdl);
		System.out.println(prot);
		System.out.println(publ);
	}


	public void publShow()
	{
		System.out.println("public:");
		System.out.println(priv);
		System.out.println(frdl);
		System.out.println(prot);
		System.out.println(publ);
	}

}
