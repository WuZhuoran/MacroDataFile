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
	/*��������ѭ��
	 * ��������(-1 << 32)��ֵ��-1������0����Ϊ��λ������ֻ��ʹ�����Ҳ������ĵ�5λ��Ϊ��λ���ȣ�����6λ��
	 * ������������һ��long���ͣ���ô��������ͨ���� << >> >>>����λ�ĳ���ֻ����0-31֮��
	 * ��� ��long���͵���ô ��0-63֮�� 
	 * ��������Ƕ�32ȡ��ģ������long������ô�Ƕ�64ȡ���
	 * �����ͼ��int��λ32����long��λ64λ����ô����Ƿ�������鱾������ʹ��ȫ������
	 * �����·������*/	
		
		int distance = 0;
		for(int val = -1; val != 0; val <<= 1)
		{
			distance++;
		}
		System.out.println(distance);
	}

	
	
}
