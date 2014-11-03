package main;

//import java.io.IOException;

public class Arcanel
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//		try
//		{
//			System.out.println("Hello world");
//		}
//		catch(IOException e)
//		{
//			System.out.println("I have never seen println fail!");
//		}
		
		/*上述例子是无法通过编译因为 声明一个catch但是try里面没有可以抛出异常的地方*/
		
		try
		{}
		catch(Exception e)
		{
			System.out.println("This can't happen!");
		}
		
		/*上面可以编译，因为它唯一的catch语句检查了Exception
		 * 捕获Exception或者Throwable的catch 是合法的e不管其中try里面什么内容
		 * 当然，这个程序不会执行catch子句*/
		
	}
	
}
