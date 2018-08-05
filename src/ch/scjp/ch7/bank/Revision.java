package ch.scjp.ch7.bank;


public class Revision extends Thread
{
	private int z1, z2;
	private Konto konto1;
	private Konto konto2;


	public Revision(Konto konto1, Konto konto2)
	{
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
				// System.out.println("revision eintritt konto1");

				synchronized (konto2)
				{
					// System.out.println("revision eintritt konto2");
					
					if (konto1.getSaldo() + konto2.getSaldo() == 0)
					{
						z1++;
					}
					else
					{
						z2++;
						System.out.println("saldo nicht null");
						konto1.setSaldo(0);
						konto2.setSaldo(0);
					}
				}
			}
		}
	}


	public void statistik()
	{
		System.out.println();
		System.out.println("Revision: ");
		System.out.printf("Pruefung OK:  %,10d \n", z1);
		System.out.printf("Pruefung NOK: %,10d \n", z2);

	}
}
