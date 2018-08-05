package ch.scjp.ch7;



public class TestSynchronize
{
	Object o = new Object();
	static Class<TestSynchronize> referenz1 = TestSynchronize.class;
	Class<TestSynchronize> referenz2 = TestSynchronize.class;

	static TestSynchronize ts1 = new TestSynchronize();
	static TestSynchronize ts2 = new TestSynchronize();


	static
	{
		synchronized (referenz1)
		{

		}
	}


	public static void main(String[] args)
	{
		TestSynchronize.test();
	}


	static void test()

	{
		System.out.println(TestSynchronize.referenz1 == ts2.referenz2);
		System.out.println(ts1.o == ts2.o);

		synchronized (referenz1)
		{

		}
	}
}
