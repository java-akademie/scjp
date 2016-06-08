package ch.scjp.ch7;

/**
 * Diese Klasse dient dem Test von synchronisierten Threads.
 * 
 * In drei Bankfilialen wird laufen auf das selbe Konto der gleiche
 * Betrag eingezahlt und gleich wieder abgehoben.
 * 
 * Ein Revisionsthread ueberprueft laufend ob der Saldo immer noch 0
 * (Null) ist. Jeder Punkt der ausgegeben wird, bedeuter eine
 * Salodabweichung.
 * 
 * @author johann
 * 
 */
public class Aufgabe6
{

	private static class Filiale extends Thread
	{
		Konto konto;
		int anzahlBuchungen;
		boolean synchronisieren;
		private Thread revision;


		Filiale(Konto konto, int anzahlBuchungen,
				boolean synchronisieren, Thread revision)
		{
			this.konto = konto;
			this.anzahlBuchungen = anzahlBuchungen;
			this.synchronisieren = synchronisieren;
			this.revision = revision;
		}


		private void doBuchen()
		{
			konto.einzahlen(1);
			konto.abheben(1);
		}


		@Override
		public void run()
		{
			for (int i = 1; i <= anzahlBuchungen; i++)
			{
				if (synchronisieren)
				{
					synchronized (konto)
					{
						doBuchen();
					}
				}
				else
				{
					doBuchen();
				}
			}
			revision.interrupt();
		}
	}


	private static class Konto
	{
		int saldo; // in Rappen


		void abheben(int betrag)
		{
			saldo -= betrag;
		}


		void einzahlen(int betrag)
		{
			saldo += betrag;
		}


		int getSaldo()
		{
			return saldo;
		}


		void setSaldo(int saldo)
		{
			this.saldo = saldo;
		}
	}

	private static class Revision extends Thread
	{
		static int anzahlFehler;

		private Konto konto;
		private boolean synchronisieren;


		Revision(Konto konto, boolean synchronisieren)
		{
			anzahlFehler = 0;
			this.konto = konto;
			this.synchronisieren = synchronisieren;

			if (synchronisieren)
			{
				System.out
						.println("   es duerften keine Fehler auftreten");
				System.out
						.print("   dafuer laeuft das Programm aber laenger");
			}
		}


		private void doCheck(String s)
		{
			if (konto.getSaldo() != 0)
			{
				konto.setSaldo(0);

				System.out.print(s);
				if (++anzahlFehler % 100 == 0)
				{
					System.out.println();

				}
			}

		}


		@Override
		public void run()
		{
			while (true)
			{
				if (synchronisieren)
				{
					synchronized (konto)
					{
						doCheck("*");
					}
				}
				else
				{
					doCheck(".");
				}

				if (isInterrupted())
					break;
			}
		}
	}


	public static void main(String[] args) throws InterruptedException
	{
		int anzahl = 10 * 1000 * 1000;
		test(anzahl, false);
		test(anzahl, true);
	}


	private static void test(int anzahlBuchungen,
			boolean synchronisieren) throws InterruptedException
	{
		Konto konto = new Konto();

		System.out.printf("Start des Programms (synchronisieren=%b "
				+ "anzahlBuchungen=%d)\n", synchronisieren,
				anzahlBuchungen);

		Thread t2 = new Revision(konto, synchronisieren);
		t2.start();

		Thread t11 = new Filiale(konto, anzahlBuchungen,
				synchronisieren, t2);
		Thread t12 = new Filiale(konto, anzahlBuchungen,
				synchronisieren, t2);
		Thread t13 = new Filiale(konto, anzahlBuchungen,
				synchronisieren, t2);

		t11.start();
		t12.start();
		t13.start();

		t11.join();
		t12.join();
		t13.join();
		t2.interrupt();

		System.out.printf("\nStopp des Programms (Fehler: %d)\n\n\n",
				Revision.anzahlFehler);
	}

}
