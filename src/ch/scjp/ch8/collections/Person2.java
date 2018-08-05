package ch.scjp.ch8.collections;

public class Person2
{
	int id;
	String name;
	String addr;


	public Person2(int id, String name, String addr)
	{
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
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
		Person2 other = (Person2) obj;
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
		return "Person2 [id=" + id + ", name=" + name + ", addr="
				+ addr + "]";
	}

}
