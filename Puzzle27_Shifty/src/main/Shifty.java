package main;

public class Shifty 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i = 0;
		while (-1 << i != 0)
		{
			i++;
		}
		System.out.println(i);
	/*进入无限循环
	 * 问题在于(-1 << 32)的值是-1而不是0，因为移位操作符只能使用其右操作数的低5位作为移位长度，或者6位。
	 * 如果左操作数是一个long类型，那么这条规则通用于 << >> >>>。移位的长度只能在0-31之间
	 * 如果 是long类型的那么 是0-63之间 
	 * 这个长度是对32取余的，如果是long类型那么是对64取余的
	 * 如果试图对int移位32或者long移位64位，那么结果是返回这个书本身，不能使其全部丢弃
	 * 用如下方法解决*/	
		
		int distance = 0;
		for(int val = -1; val != 0; val <<= 1)
		{
			distance++;
		}
		System.out.println(distance);
	}

	
	
}
