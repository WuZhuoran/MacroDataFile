package main;

public class UnwelcomeGuest 
{
//
//	public static final long GUEST_USER_ID = -1;
//	private static final long USER_ID;
//	
//	static 
//	{
//		try
//		{
//			USER_ID = getUserIdFromEnvironment();
//		}catch(IdUnavailableException e)
//		{
//			USER_ID = GUEST_USER_ID;
//			System.out.println("Logging in as guest");
//		}
//	}
//	public static void main(String[] args) 
//	{
//		// TODO Auto-generated method stub
//		System.out.println("UserId : "+ USER_ID);
//		
//	}
//	
//	private static long getUserIdFromEnvironment()
//	{
//		throws IdUnavailableException
//		{
//			throw new IdUnavailableException();
//		}
//	}
//	
//	class IdUnavailableException extends Exception
//	{
//		IdUnavailableException()
//		{
//			
//		}
//	}
	
	/*
	 * 这个程序不能通过编译
	 * 因为USER_ID是个空的未被初始化的字段
	 * 在程序中 一个空final字段只有在他的确未赋值的地方才可以被赋值*/
}
