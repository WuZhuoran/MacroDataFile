package main;

public class Indecisive 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println(decision());
		/*
		 * ���false
		 * decision��������ͬʱ����true or false
		 * ԭ�����ڣ���һ��try - finally ����У�finally���������ڿ���Ȩ�뿪try���ʱִ��
		 * ����try���������������쳣��������������������׳��쳣��������һ����յ������ִ��break; continue;����returnʱ�������������
		 * ��try�����finally���鶼�������ʱ����������try�����������ԭ�򽫱�������������try-finally������������ԭ�򽫺�finally������������ԭ����ͬ
		 * ����˵�������Է���true ����ʵ�������շ���false
		 * 
		 * ���ۣ���Ҫʹ��return break, continue��throw���˳�finally��
		 * */
	}
	
	static boolean decision()
	{
		try
		{
			return true;
		}
		finally
		{
//			return false;
		}
	}
	
	

}
