package ch.scjp.ch8;

class WrapperTest
{
	static double bogenmass(double grad)
	{
		return Math.PI * grad / 180;
	}


	public static void main(String[] args)
	{
		// testMath();
		testWrapper();
	}


	static void put(String s)
	{
		System.out.println(s);
	}


	static void testMath()
	{
		double f;

		f = (long) Math.floor(-0.77);
		System.out.println(f);

		f = (long) Math.floor(0.77);
		System.out.println(f);

		f = Math.random();
		System.out.println(f);

		f = Math.round(12.5);
		System.out.println(f);

		f = Math.cos(bogenmass(89));
		System.out.println(f);

		System.out.println(bogenmass(360));

		System.out.println("" + Math.sqrt(144));
		System.out.println("" + Math.pow(144, (1.0 / 2)));
	}


	static void testWrapper()
	{
		Boolean bo;
		Character c;
		Byte b;
		// Short s;
		// Integer i;
		// Long l;
		// Float f;
		// Double d;

		bo = new Boolean(true);
		put("" + bo);

		c = new Character('x');
		put("" + c);
		char pc = 100;
		c = new Character(pc);
		put("" + c);

		b = new Byte("12");
		put("" + b);
		b = new Byte((byte) 11);
		put(b.toString());
		byte bb = b.byteValue();
		put("" + bb);

	}
}
