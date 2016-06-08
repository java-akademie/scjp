package ch.scjp.ch8.collections;

/**
 * diese Klasse dient dem Test von Collections
 * 
 * @author johann mildner, basel
 * 
 */
public class Teilnehmer implements Comparable<Teilnehmer>
{
	private int id;
	private String name;
	private String ort;


	Teilnehmer(int id, String name, String ort)
	{
		this.id = id;
		this.name = name;
		this.ort = ort;
	}


	@Override
	public int compareTo(Teilnehmer that)
	{
		int diff = 0; // entweder id oder name ...
		diff = this.name.compareTo(that.name);
		diff = this.ort.compareTo(that.ort);
		diff = this.id - that.id;
		return diff;
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
		Teilnehmer other = (Teilnehmer) obj;
		if (id != other.id)
			return false;
		return true;
	}


	public int getId()
	{
		return id;
	}


	public String getName()
	{
		return name;
	}


	public String getOrt()
	{
		return ort;
	}


	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}


	public void setId(int id)
	{
		this.id = id;
	}


	public void setName(String name)
	{
		this.name = name;
	}


	public void setOrt(String ort)
	{
		this.ort = ort;
	}


	public void show()
	{
		System.out.println(this);
	}


	@Override
	public String toString()
	{
		return String.format(
				"Teilnehmer: id=%-5d name=%-10s ort=%-10s", id, name,
				ort);
	}


}
