package main;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


public class SerialKiller 
{
	
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Sub sub = new Sub(666);
		sub.checkInvariant();
		
		Sub copy = (Sub) deepCopy(sub);
		copy.checkInvariant();
	}
	
	static public Object deepCopy(Object obj)
	{
		try
		{
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			new ObjectOutputStream(bos).writeObject(obj);
			ByteArrayInputStream bin = new ByteArrayInputStream(bos.toByteArray());
			
			return new ObjectInputStream(bin).readObject();
		}
		catch(Exception e)
		{
			throw new IllegalArgumentException(e);
		}
	}

}

class Super implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	final Set<Super> set = new HashSet<Super>();
}

class Sub extends Super
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	
	public Sub(int id)
	{
		this.id = id;
		set.add(this);
	}
	
	public void checkInvariant()
	{
		if(!set.contains(this))
		{
			throw new AssertionError("Invariant violated!");
		}
	}
	
	public int hashCode()
	{
		return id;
	}
	
	public boolean equals(Object o)
	{
		return (o instanceof Sub) && (id == ((Sub)o).id);
	}
}
/*±àÒë²»Í¨¹ý
 * Exception in thread "main" java.lang.AssertionError: Invariant violated!
	at main.Sub.checkInvariant(SerialKiller.java:64)
	at main.SerialKiller.main(SerialKiller.java:24)
 * */
