package main;

public class CleverSwap 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int x = 1984;//(0x7c0)
		int y = 2001;//(0x7d1)
		x ^= y^= x^= y;
		System.out.println("x = " + x + "; y = " + y);
		/*
		 * 操作符是从左向右求值的
		 * 为了计算 x^= expr的值，在计算expr之前就会提取x的值
		 * 
		 * 在单个表达式中不要对于相同变量赋值两次*/
	}

}
