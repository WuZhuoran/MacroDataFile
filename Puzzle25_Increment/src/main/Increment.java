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
		 * Ӧ�����100 ����ʵ�������0
		 * ��һ��++������������һ������ֵ֮�������þ���һ����׺����������
		 * ���ʽj++��ֵ����j��ִ����������֮ǰ�ĳ�ʼֵ
		 * ��j = j++ �ȼ���
		 * int temp = j;
		 * j = j + 1;
		 * j = temp;
		 * 
		 * 
		 * ���ۣ���Ҫ�ڵ������ʽ�ж���ͬ�ı�����ֵ����һ��*/
		j = 0;
		for(int i = 0; i < 100; i++)
		{
			j++;
		}
		System.out.println(j);
	}

}
