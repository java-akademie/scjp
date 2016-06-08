package ch.scjp.ch8.collections;

public class Person implements Comparable<Object>
{
	private int id;
	private String name;
	private String addr;


	public Person(int id, String name, String addr)
	{
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
	}


	public void show()
	{
		System.out.println(this.toString());
	}


	@Override
	public String toString()
	{
		return "Person [id=" + id + ", name=" + name + ", addr="
				+ addr + "]";
	}


	@Override
	public int compareTo(Object o)
	{
		String a = this.name + this.id;
		Person that = (Person) o;
		String b = that.name + that.id;
		return a.compareTo(b);
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
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		return true;
	}


	public int getId()
	{
		return id;
	}


	public void setId(int id)
	{
		this.id = id;
	}


	public String getName()
	{
		return name;
	}


	public void setName(String name)
	{
		this.name = name;
	}


	public String getAddr()
	{
		return addr;
	}


	public void setAddr(String addr)
	{
		this.addr = addr;
	}

}
