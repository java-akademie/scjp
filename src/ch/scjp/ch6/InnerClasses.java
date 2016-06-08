package ch.scjp.ch6;

public class InnerClasses
{
	static int zaehler = 111;
	int wert = 25;


	public static void main(String[] args)
	{
		System.out.println("start TestInnerClasses");

		InnerClasses ic = new InnerClasses();
		ic.doitm();
		KlassKlasse.doitk();

		doit2(333, 444);
		ic.doit3(555, 666);
		System.out.println("stopp TestInnerClasses");
	}


	@SuppressWarnings("unused")
	static private void doit2(final int p1, int p2)
	{
		final int a = 111;
		int b = 222;

		abstract class LK
		{
			void lkdoit()
			{
				System.out.println("aus lokaler klasse");
				System.out.println(a);
				// System.out.println(b);
				System.out.println(p1);
				// System.out.println(p2);
				System.out.println(zaehler);
				// System.out.println(wert);
			}
		}

		abstract class LokaleKlasse1 extends LK
		{
		}
		class LokaleKlasse extends LokaleKlasse1
		{
		}
		LokaleKlasse lk = new LokaleKlasse();
		lk.lkdoit();
	}


	private void doit3(final int p1, int p2)
	{
		final int a = 111;
		int b = 222;

		if (b == 223)
			;
		else
		{
			class LokaleKlasse
			{
				void lkdoit()
				{
					System.out.println("aus lokaler klasse");
					System.out.println(a);
					// System.out.println(b);
					System.out.println(p1);
					// System.out.println(p2);
					System.out.println(zaehler);
					System.out.println(wert);
				}
			}

			LokaleKlasse lk = new LokaleKlasse();
			lk.lkdoit();
		}
	}


	private void doitm()
	{
		MemberKlasse mk = new MemberKlasse();
		mk.doitm();
	}

	class MemberKlasse
	{
		void doitm()
		{
			System.out.println("doit aus MemberKlasse " + wert + "/" + zaehler);
		}
	}

	static class KlassKlasse
	{
		static void doitk()
		{
			System.out.println("doit aus KlassKlasse " + zaehler);
		}
	}

	static
	{
		@SuppressWarnings("unused")
		class KlassKlasse2
		{
			void doitk()
			{
				System.out.println("doit aus KlassKlasse2 " + zaehler);
			}
		}
	}
}
