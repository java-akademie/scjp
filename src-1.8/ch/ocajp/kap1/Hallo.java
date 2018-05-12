
package ch.ocajp.kap1;

import ch.jmildner.tools.MyTools;

public class Hallo
{
	public static void main(String[] args)
	{
		if (args.length > 0)
		{
			System.out.println(args[0]);
		}
		else
		{
			String name = MyTools.getString("bitte Namen eingebne > ");
			System.out.println("Hallo " + name);

		}
	}
}

