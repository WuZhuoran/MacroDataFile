package main;

public class Type 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Type1
		String s = null;
		System.out.println(s instanceof String);//1
		
		//System.out.println(new Type() instanceof String);//2
	
		//Type t = (Type) new Object();//3
		
		/*
		 * ����1������ÿһ������������˵�������������ͣ�����instanceof ������������Ϊ�������������null��ʱ�򷵻�false������Type����ӡfalse
		 * ����2�����벻ͨ����˵����instanceof�������ڲ���һ�����ʵ����ʱ���Բ鿴���Ƿ���ĳ������ص����ʵ��������ʧ������Ϊinstanceof��Ҫ��
		 * ������������������Ͷ����࣬��ô����һ����������һ����������
		 * ����3��ͨ�����룬��������ʱ�׳��쳣����Ȼ���ת�ͻ��ʧ�ܣ�����instanceof��û��ǿ���ܹ���Ϥ���ʽnew Object()���������Ͳ�������Type��������
		 * */
	}

}
