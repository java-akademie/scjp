package ch.scjp.ch8.collections;

public class Person1 implements Comparable<Object>
{
	int id;
	String name;


	public Person1(int id, String name)
	{
		super();
		this.id = id;
		this.name = name;
	}


	// Noetig fuer TreeSet und TreeMap
	@Override
	public int compareTo(Object o)
	{
		Person1 that = (Person1) o;

		String v1 = this.name + this.id;
		String v2 = that.name + that.id;
		return v1.compareTo(v2);
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
		Person1 other = (Person1) obj;
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
		return "Person [id=" + id + ", name=" + name + "]";
	}

}
