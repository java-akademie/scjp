
package ch.ocajp.kap1;

import java.util.Enumeration;
import java.util.Properties;

import ch.jmildner.tools.MyTools;

public class Hello
{
	public static void main(String[] args)
	{
		if (args.length > 0)
		{
			System.out.println("Hello " + args[0]);
		}
		else
		{
			String name = MyTools
					.getString("please enter your name > ");
			System.out.println("Hello " + name);
		}

		Properties props = System.getProperties();
		showProps(props);
	}


	private static void showProps(Properties props)
	{
		Enumeration<?> e = ((Enumeration<?>) props.propertyNames());

		for (; e.hasMoreElements();)
		{
			String key = (String) e.nextElement();
			System.out.println(key + "=" + props.getProperty(key));
		}
	}
}

