package main;

public class Reluctant 
{
//	private Reluctant internalInstance = new Reluctant();
	
	public Reluctant() throws Exception
	{
		throw new Exception("I'm not coming out");
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		try
		{
//			Reluctant b = new Reluctant();
			System.out.println("Surprise!");
		}
		catch(Exception e)
		{
			System.out.println("I told you so");
		}
	}

}
