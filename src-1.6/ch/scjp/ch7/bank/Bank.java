package ch.scjp.ch7.bank;

import java.util.Locale;

import ch.java_akademie.tools.MyTools;

public class Bank
{

	public static void main(String[] args) throws InterruptedException
	{
		Locale.setDefault(new Locale("de", "CH"));

		Konto konto1 = new Konto();
		Konto konto2 = new Konto();

		Filiale be = new Filiale("BE", konto1, konto2);
		be.start();

		Filiale ge = new Filiale("GE", konto1, konto2);
		ge.start();

		Filiale zh = new Filiale("ZH", konto1, konto2);
		zh.start();

		Revision rev = new Revision(konto1, konto2);
		rev.start();

		MyTools.sleep(1000);

		be.interrupt();
		ge.interrupt();
		zh.interrupt();
		rev.interrupt();
		
		be.join();
		ge.join();
		zh.join();
		rev.join();

		be.statistik();
		ge.statistik();
		zh.statistik();
		rev.statistik();

		System.out.println();
		
		System.out.printf("Kontostand konto1: %+,d %n",konto1.getSaldo());
		System.out.printf("Kontostand konto2: %+,d %n",konto2.getSaldo());
		
		
		System.out.println("\nBanktag beendet ");
	}
}
