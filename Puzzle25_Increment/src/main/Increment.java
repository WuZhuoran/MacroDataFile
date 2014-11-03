package main;

public class Increment {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int j = 0;
		for(int i = 0; i < 100; i++)
		{
			j = j++;
		}
		System.out.println(j);
		/*
		 * 应该输出100 但是实际输出是0
		 * 当一个++操作符被置于一个变量值之后，其作用就是一个后缀增量操作符
		 * 表达式j++的值等于j在执行增量操作之前的初始值
		 * 这j = j++ 等价于
		 * int temp = j;
		 * j = j + 1;
		 * j = temp;
		 * 
		 * 
		 * 结论：不要在单个表达式中对相同的变量赋值超过一次*/
		j = 0;
		for(int i = 0; i < 100; i++)
		{
			j++;
		}
		System.out.println(j);
	}

}
