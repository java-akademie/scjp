package ch.scjp.ch8.collections;


public class Schluessel implements Comparable<Object>
{
	int id;


	public Schluessel(int id)
	{
		this.id = id;
	}


	@Override
	public int compareTo(Object o)
	{
		Schluessel that = (Schluessel) o;
		return this.id - that.id;
	}



	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Schluessel other = (Schluessel) obj;
		if (id != other.id)
			return false;
		return true;
	}


	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}


	@Override
	public String toString()
	{
		return "" + id;
	}


}
