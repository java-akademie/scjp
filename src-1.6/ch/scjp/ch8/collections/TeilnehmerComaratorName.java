package ch.scjp.ch8.collections;

import java.util.Comparator;

public class TeilnehmerComaratorName implements Comparator<Teilnehmer>
{

	@Override
	public int compare(Teilnehmer o1, Teilnehmer o2)
	{
		return o1.getName().compareTo(o2.getName());
	}

}
