package main;

class String
{
	private final java.lang.String s;
	
	public String(java.lang.String s)
	{
		this.s = s;
	}
	
	public java.lang.String toString()
	{
		return s;
	}
}

public class StrungOut 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s = new String("Hello World");
		System.out.println(s);
	}
	/*不能运行，错误提示为：
	 * 错误: 在类 main.StrungOut 中找不到 main 方法, 请将 main 方法定义为:
   public static void main(String[] args)
   
	 尽管StrungOut有一个main函数，但实际上 主函数需要一个String类型的参数。
	 而由于我们定义了String所以这个String就不是java.lang里面的String了
	 
	 结论：永远不要重用java.lang里面的类。
	 
	 修正程序。修改你自己定义的类名即可*/

}
