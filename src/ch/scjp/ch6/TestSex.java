package ch.scjp.ch6;

enum Sex
{
	m, w;
}



public class TestSex
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Sex s1 = Sex.m;
		Sex s2 = Sex.w;
		Sex s3 = Sex.w;

		System.out.println("" + s1 + s2 + s3);

	}

}
