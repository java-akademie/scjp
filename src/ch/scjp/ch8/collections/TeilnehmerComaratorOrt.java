package ch.scjp.ch8.collections;

import java.util.Comparator;

public class TeilnehmerComaratorOrt implements Comparator<Teilnehmer>
{

	@Override
	public int compare(Teilnehmer o1, Teilnehmer o2)
	{
		return o1.getOrt().compareTo(o2.getOrt());
	}

}
