package ch.scjp.ch7.bank;

public class Filiale extends Thread
{
	private int z1;
	private String name;
	private Konto konto1;
	private Konto konto2;


	public Filiale(String name, Konto konto1, Konto konto2)
	{
		this.name = name;
		this.konto1 = konto1;
		this.konto2 = konto2;
	}


	public void run()
	{
		for (;;)
		{
			if (isInterrupted())
			{
				break;
			}

			synchronized (konto1)
			{
				// System.out.println(name + " eintritt konto1");
				
				synchronized (konto2)
				{
					// System.out.println(name + " eintritt konto2");

					z1++;
				
					int betrag=(int)(Math.random()*1000);
					
					konto1.abheben(betrag);
					konto2.einzahlen(betrag);
				}
			}
		}
	}


	public void statistik()
	{
		System.out.println();
		System.out.printf("Filiale %s:%n", name);
		System.out.printf("Buchungen:    %,10d \n", z1);
	}
}
