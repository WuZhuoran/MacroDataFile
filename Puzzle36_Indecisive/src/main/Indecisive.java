package main;

public class Indecisive 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println(decision());
		/*
		 * 输出false
		 * decision函数不能同时返回true or false
		 * 原因在于：在一个try - finally 语句中，finally语句块总是在控制权离开try语句时执行
		 * 无论try是正常结束还是异常结束，情况都是这样。抛出异常或者是在一个封闭的语句内执行break; continue;或者return时，都是意外结束
		 * 当try语句块和finally语句块都意外结束时（本例），try中意外结束的原因将被丢弃，而整个try-finally语句意外结束的原因将和finally语句意外结束的原因相同
		 * 简单来说，程序尝试返回true 但是实际上最终返回false
		 * 
		 * 结论，不要使用return break, continue或throw来退出finally块
		 * */
	}
	
	static boolean decision()
	{
		try
		{
			return true;
		}
		finally
		{
//			return false;
		}
	}
	
	

}
