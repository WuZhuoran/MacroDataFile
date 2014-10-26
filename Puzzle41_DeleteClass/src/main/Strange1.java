package main;

public class Strange1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		{
			//Missing m = new Missing();
			
		}catch(NoClassDefFoundError ex)
		{
			System.out.println("Got it!");
		}
	}
	/*
	 * 如果编译41 42两个文件然后在运行之前删除两个.class文件
	 * 那么这两个程序的行为不同
	 * 41是抛出异常
	 * 42打印了Got it*/
}
