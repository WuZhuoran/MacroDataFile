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
		 * û�д�ӡ�κζ���
		 * 0x90��һ��int������������byte����ֵ��Χ +144
		 * ��byte��int�ıȽ��ǻ�����͵ıȽ�
		 * ((byte)0x90 == 0x90) �Ľ����false
		 * ��ΪJAVA�����ؿ�byte����Ȼ���ٱȽ�
		 * ����byte��һ���з��ŵģ�������չ��ת��ִ�����з�����չ
		 * ������byte����Ϊ����������ȵ�int��ֵ������������Ϊ-122.
		 * 
		 * ���ڻ�����͵�ת���ǲ����ӣ����Բ������·���*/
		for(byte b = Byte.MIN_VALUE; b < Byte.MAX_VALUE; b++)
		{
			if(b == (byte)0x90)
			{
				System.out.print("Joy!");
			}
		}
		/*���joy
		 * ����ʹ��������*/
		for(byte b = Byte.MIN_VALUE; b < Byte.MAX_VALUE; b++)
		{
			if((b & 0xff) == 0x90)
			{
				System.out.print("Joy!");
			}
		}
		
		//����õķ�������ѭ�������ó���ֵ����
		
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
