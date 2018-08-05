package ch.scjp.ch6;

public class InnerClassesTest
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		InnerClasses.KlassKlasse.doitk();

		InnerClasses ic = new InnerClasses();
		InnerClasses.MemberKlasse mk = ic.new MemberKlasse();
		mk.doitm();
	}

}
