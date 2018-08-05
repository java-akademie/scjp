package ch.scjp.ch3.ski;

import ch.jmildner.tools.MyTools;

class DownhillSki extends Ski
{
	static Ski x = new Ski();


	public static void main(String[] args)
	{
		DownhillSki s = new DownhillSki();
		s.applyWax();
		x.applyWax();
		MyTools.pause();
	}


	@Override
	public void applyWax()
	{
		super.applyWax();
		System.out.println("dh wachs wird aufgetragen");
	}


	void tuneUp()
	{
		// x.applyWax();
	}
}
