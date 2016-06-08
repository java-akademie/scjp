package ch.scjp.ch8.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TeilnehmerTest
{


	public static void main(String[] args)
	{
		new TeilnehmerTest().doit();
	}


	private void doit()
	{
		testName();
		testId();
		testOrt();
		testUnsortiert();
	}


	private void fuellenUndAusgeben(Set<Teilnehmer> set)
	{
		set.add(new Teilnehmer(4712, "hugo", "wien"));
		set.add(new Teilnehmer(4711, "sepp", "aarau"));
		set.add(new Teilnehmer(4716, "fritz", "zuerich"));
		set.add(new Teilnehmer(4715, "walter", "bern"));
		set.add(new Teilnehmer(4717, "anna", "rheinfelden"));

		for (Teilnehmer s : set)
		{
			s.show();
		}
	}


	private void testId()
	{
		System.out.println("\nID");

		Set<Teilnehmer> set = new TreeSet<Teilnehmer>();

		fuellenUndAusgeben(set);
	}


	private void testName()
	{
		System.out.println("\nNAME");
		Set<Teilnehmer> set = new TreeSet<Teilnehmer>(
				new TeilnehmerComaratorName());

		fuellenUndAusgeben(set);
	}


	private void testOrt()
	{
		System.out.println("\nORT");

		Set<Teilnehmer> set = new TreeSet<Teilnehmer>(
				new TeilnehmerComaratorOrt());

		fuellenUndAusgeben(set);
	}


	private void testUnsortiert()
	{
		System.out.println("\nUNSORTIERT");

		Set<Teilnehmer> set = new HashSet<Teilnehmer>();

		fuellenUndAusgeben(set);
	}
}
