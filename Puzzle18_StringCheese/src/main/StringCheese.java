package main;

import java.nio.charset.Charset;

public class StringCheese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte bytes[] = new byte[256];
		for(int i = 0; i < 256; i++)
		{
			bytes[i] = (byte)i;
		}
		String str = new String(bytes);
		for(int i = 0, n = str.length(); i < n; i++)
		{
			System.out.print((int)str.charAt(i) + " ");
		}
		System.out.println();
		
		/*期望与程序输出0-255 但是从127之后就得到不一样的序列，不同的机器上不同
		 * 问题在于String(bytes[])构造函数，描述为：
		 * 再通过解码使用平台默认的字符集的指定byte数组来狗仔一个新的String,该新的String的长度是字符集的一个函数，因此，他可能不等于byte数组的长度。这个构造器的行为
		 * 是不确定的，当给定的所有字节在默认字符集中并非全部有效时*/
		System.out.println(Charset.defaultCharset().toString()); //GBK
		/*当你将一个byte序列装换成一个string时，你都在使用一个字符集，不管是否显式的指定*/
		
	}

}
