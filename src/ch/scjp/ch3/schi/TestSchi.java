package ch.scjp.ch3.schi;

import ch.scjp.ch3.schi.nordisch.AbfahrtsSchi;
import ch.scjp.ch3.schi.nordisch.LanglaufSchi;

public class TestSchi
{
	public static void main(String[] args)
	{
		System.out.println("test");
		AbfahrtsSchi ab = new AbfahrtsSchi();
		ab.tuning();
		LanglaufSchi ll = new LanglaufSchi();
		ll.tuning();
	}

}
