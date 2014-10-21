package main;

public class DosEquis 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//char x = 'X';
		//int i = 0;
		//System.out.println(true ? x : 0);
		//System.out.println(false ? i : x);
		
		/*
		 * 混合类型的计算会引起错误，尤其是条件表达式中
		 * x是char 类型
		 * 0是int 类型
		 * true是boolean 类型
		 * 
		 * 如果一个操作数类型是T，T是byte short 或char，而另一个是int，那么结果的类型是T 
		 * 否则，如果前面一个操作数更大一点，那儿结果是更大那一个类型
		 * 
		 * 不同的类型将会决定票print函数的调用哪个方法。
		 * 第二个虽然是输出X但是类型已经转化为int，即输出X的int值*/
	}

}
