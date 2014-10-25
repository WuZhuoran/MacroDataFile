package main;

public class BigDelight 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		for(byte b = Byte.MIN_VALUE; b < Byte.MAX_VALUE; b++)
		{
			if(b == 0x90)
			{
				System.out.print("Joy!");
			}
		}
		/*
		 * 没有打印任何东西
		 * 0x90是一个int常量，超出了byte的数值范围 +144
		 * 而byte和int的比较是混合类型的比较
		 * ((byte)0x90 == 0x90) 的结果是false
		 * 因为JAVA首先拓宽byte类型然后再比较
		 * 由于byte是一个有符号的，所以拓展是转换执行是有符号拓展
		 * 将负的byte提升为在数字上相等的int数值，本例中提升为-122.
		 * 
		 * 由于混合类型的转换是不可视，所以采用如下方法*/
		for(byte b = Byte.MIN_VALUE; b < Byte.MAX_VALUE; b++)
		{
			if(b == (byte)0x90)
			{
				System.out.print("Joy!");
			}
		}
		/*输出joy
		 * 或者使用屏蔽码*/
		for(byte b = Byte.MIN_VALUE; b < Byte.MAX_VALUE; b++)
		{
			if((b & 0xff) == 0x90)
			{
				System.out.print("Joy!");
			}
		}
		
		//但最好的方法是在循环外面用常量值声明
		
		final byte TARGET = (byte) 0x90;
		
		for(byte b = Byte.MIN_VALUE; b < Byte.MAX_VALUE; b++)
		{
			if(b  == TARGET)
			{
				System.out.print("Joy!");
			}
		}		
	}

}
