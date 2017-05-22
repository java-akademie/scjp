package ch.scjp.ch7;

public class Aufgabe61
{
	public static void main(String[] args) throws InterruptedException
	{
		Konto k = new Konto();

		Filiale f1 = new Filiale(k, 1);
		Filiale f2 = new Filiale(k, 2);
		Filiale f3 = new Filiale(k, 3);

		Revision rev = new Revision(k);

		f1.start();
		f2.start();
		f3.start();

		rev.setDaemon(true);
		rev.start();

		f1.join();
		f2.join();
		f3.join();

		System.out.println("stopp .........");
	}

}



class Filiale extends Thread
{
	int MAX = 1000000;

	Konto konto;
	int filialNummer;


	Filiale(Konto konto, int filialNummer)
	{
		this.filialNummer = filialNummer;
		this.konto = konto;
	}


	@Override
	public void run()
	{
		for (int i = 1; i <= MAX; i++)
		{
			// synchronized (konto)
			{
				long betrag = (long) (Math.random() * 100000);
				konto.einzahlen(betrag);
				konto.abheben(betrag);
			}
		}
	}
}



class Konto
{
	long saldo; // in Rappen


	void abheben(long betrag)
	{
		saldo -= betrag;
	}


	void einzahlen(long betrag)
	{
		saldo += betrag;
	}


	long getSaldo()
	{
		return saldo;
	}


	public void setSaldo(long saldo)
	{
		this.saldo = saldo;

	}

}



class Revision extends Thread
{
	Konto konto;

	int zaehler;


	Revision(Konto konto)
	{
		this.konto = konto;
	}


	@Override
	public void run()
	{
		for (;;)
		{
			// synchronized (konto)
			{
				zaehler++;
				if (konto.getSaldo() != 0)
				{
					System.out.println(zaehler + " saldo nicht null");
					konto.setSaldo(0);
				}
			}
		}
	}
}
