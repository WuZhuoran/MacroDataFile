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
		
		/*������������0-255 ���Ǵ�127֮��͵õ���һ�������У���ͬ�Ļ����ϲ�ͬ
		 * ��������String(bytes[])���캯��������Ϊ��
		 * ��ͨ������ʹ��ƽ̨Ĭ�ϵ��ַ�����ָ��byte����������һ���µ�String,���µ�String�ĳ������ַ�����һ����������ˣ������ܲ�����byte����ĳ��ȡ��������������Ϊ
		 * �ǲ�ȷ���ģ��������������ֽ���Ĭ���ַ����в���ȫ����Чʱ*/
		System.out.println(Charset.defaultCharset().toString()); //GBK
		/*���㽫һ��byte����װ����һ��stringʱ���㶼��ʹ��һ���ַ����������Ƿ���ʽ��ָ��*/
		
	}

}
