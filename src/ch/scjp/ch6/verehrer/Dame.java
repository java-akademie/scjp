package ch.scjp.ch6.verehrer;

import java.util.LinkedList;
import java.util.List;

import ch.java_akademie.tools.MyTools;

public class Dame
{
	private List<Verehrer> verehrer = new LinkedList<Verehrer>();

	String name;
	int zaehler = 0;


	Dame(String name)
	{
		this.name = name;
	}



	public void addVerehrer(Verehrer v)
	{
		verehrer.add(v);
	}



	public void life()
	{

		for (;;)
		{
			int dauer = MyTools.getRandom(1, 4);
			MyTools.sleep(dauer * 1000);

			if (verehrer.size() == 0)
			{
				continue;
			}

			int i = MyTools.getRandom(1, verehrer.size());

			Verehrer v = verehrer.get(i - 1);

			v.anruf(this.name);
		}
	}
}
