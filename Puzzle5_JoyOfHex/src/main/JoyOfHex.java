package main;

public class JoyOfHex 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println(Long.toHexString(0x100000000L + 0xcafebabe));
		/*
		 * 程序应该输出 1cafebabe
		 * 这是因为这是一个Long 类型 + 一个int类型
		 * 其中后面的类型被提升到long类型的时候，0xcafebabe作为一个int常量 它的最高位被置位了，
		 * 以下为手写加法：
		 * 	0xffffffffcafebabeL
		 * +0x0000000100000000L
		 * =0x00000000cafebabeL*/
	}

}
