package main;

import java.util.Arrays;
//import static java.util.Arrays.toString;

public class ImportDuty 
{
	static void printArgs(Object ... args)
	{
		System.out.println(Arrays.toString(args));
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		printArgs(1,2,3,4,5);
	
	}
	/*无法编译
	 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The method toString() in the type Object is not applicable for the arguments (Object[])
	   编译器在选择在运行期被调用的方法时，所做的第一件事就是在肯定能找到该方法的作用域内挑选，编译器将在包含了具有恰当名字的方法的最小闭合
	   作用域内进行挑选，在我们程序中，这个作用域就是ImportDuty类，他包含了从Object继承而来的toString方法，这个作用域中没有任何可以
	  应用到toString（args）的方法，因此编译器拒绝程序。
	  
	  解决办法，显式的调用Arrays.ToString
	  并且把import中的static去掉
	  
	  需要有节制的使用静态导入import static*/
	

}

