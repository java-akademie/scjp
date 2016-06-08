package ch.scjp.ch8.collections;


public class Person3 implements Comparable<Object>
{
	int id;
	String name;


	public Person3(int id, String name)
	{
		this.id = id;
		this.name = name;
	}



	@Override
	public int compareTo(Object o)
	{
		Person3 that = (Person3) o;
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
		Person3 other = (Person3) obj;
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
		return id + ": " + name;
	}


}
