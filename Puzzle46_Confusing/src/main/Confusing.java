package main;

public class Confusing 
{
	private Confusing(Object o)
	{
		System.out.println("Object!");
	}

	private Confusing(double[] dArray)
	{
		System.out.println("double array");
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		new Confusing(null);
	}
	
	 /* 打印double array
	 * JAVA的重载解析式分2阶段运行的。第一阶段选取所有可获得并且可应用的方法或构造器
	 * 第二阶段是在第一阶段之后选取其中最精确的那个。
	 * 由于double是Object的子类，所以Object的缺乏精确性*/

}
