package main;

public class HelloGoodbye 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		{
			System.out.println("Hello World");
			System.exit(0);
		}
		finally
		{
			System.out.println("Goodbye World");
		}
	
		/*exit会直接退出当前线程和其他所有线程
		 * 而在执行之前需要有两项清理工作：1.执行所有的挂钩操作，这些操作是注册到 Runtime.addShutDownHook上的
		 * 2与终结器有关。
		 * 永远不要调用
		 * System.runFinalizersOnExit
		 * Runtime.runFinalizersOnExit*/
	}
	

}
