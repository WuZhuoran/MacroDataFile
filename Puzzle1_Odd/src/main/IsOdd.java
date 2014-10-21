package main;

public class IsOdd 
{

	public static void main(String[] args) 
	{
		
		// TODO Auto-generated method stub
		
		for(int i = -10; i < 11; i++)
		{
			System.out.println(i + ": " + isOdd(i)); 
			
		}

	}
	
	public static boolean isOdd(int i) 
	{
		return i % 2 == 1; //这样负数部分无法检测
	}
	
	public static boolean isOddNew(int i)
	{
		return i % 2 != 0;
	}
	
	public static boolean isOddForPerformance(int i)
	{
		//强调性能时，使用&代替取余
		return (i & 1) != 0;
	}
	/*
	 * JAVA中的取余操作符被定义为对于所有的int数a 和 非零int 数 b都满足如下等式
	 *  (a / b) * b + (a % b) == a
	 *  即a除以b 乘以b 然后加上余数就等于a
	 *  这意味着：当取余操作返回一个非零结果时，他与左操作数有着相同的正负符号
	 *  
	 *  当i=负奇数时， i%2=-1而不是1 isOdd方法是错误的*/
}
