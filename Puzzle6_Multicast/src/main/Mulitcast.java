package main;

public class Mulitcast 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println((int)(char)(byte) -1 );
		//输出65535
		/*
		 * JAVA使用基于2的补码二进制运算，所以一开始的int类型-1的所有32位都是置位的，从32位int转型到8位的byte，还是-1
		 * 由于char无符号 byte有符号 所以8位的byte到char不是单独的拓宽 由于本来有符号，所以发生符号扩展，作为结果的char中的16位都被置位了，等于2^16 - 1
		 * 而char转为int，拓宽 不变
		 * 
		 * 解决方法 将一个char转为更宽的类型是，如果不希望有符号扩展，那么使用一个位掩码*/
		
		byte i = -1;
		char c = (char)(i & 0xff);
		System.out.println(c);
	}

}
