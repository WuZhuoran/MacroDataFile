package main;

public class HalfJin 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*什么两个变量，x 和 i 使得
		 * x += i合法
		 * x = x + i 不合法*/
		
		/*两个赋值表达式 并不是 一 是 二的简化，
		 * 第一个表达式使用的是复合赋值表达式
		 * 而复合类型表达式自动将所执行计算的结果转型为其左侧变量的类型*/
		
		short i = 0;
		int x = 123456;
		i += x;
		System.out.println(i);//结果是-7616
		
		//short a = 0;
		//int b = 123456;
		//a = a + b; //这一句是编译不通过的
		
		//System.out.println(a);
	}

}
