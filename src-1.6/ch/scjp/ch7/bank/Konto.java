package ch.scjp.ch7.bank;

public class Konto
{
	private int saldo;


	public void abheben(int betrag)
	{
		saldo -= betrag;
	}


	public void einzahlen(int betrag)
	{
		saldo += betrag;
	}


	public int getSaldo()
	{
		return saldo;
	}


	public void setSaldo(int saldo)
	{
		this.saldo = saldo;
	}
}
