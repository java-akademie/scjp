package ch.scjp.ch3.test;

import ch.scjp.ch3.Super11;

public class Sub11 extends Super11
{
	@Override
	protected void foo()
	{
		super.foo();
		System.out.println(111);
	}
}
