package main;

import java.util.Arrays;
//import static java.util.Arrays.toString;

public class ImportDuty 
{
	static void printArgs(Object ... args)
	{
		System.out.println(Arrays.toString(args));
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		printArgs(1,2,3,4,5);
	
	}
	/*�޷�����
	 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The method toString() in the type Object is not applicable for the arguments (Object[])
	   ��������ѡ���������ڱ����õķ���ʱ�������ĵ�һ���¾����ڿ϶����ҵ��÷���������������ѡ�����������ڰ����˾���ǡ�����ֵķ�������С�պ�
	   �������ڽ�����ѡ�������ǳ����У�������������ImportDuty�࣬�������˴�Object�̳ж�����toString�����������������û���κο���
	  Ӧ�õ�toString��args���ķ�������˱������ܾ�����
	  
	  ����취����ʽ�ĵ���Arrays.ToString
	  ���Ұ�import�е�staticȥ��
	  
	  ��Ҫ�н��Ƶ�ʹ�þ�̬����import static*/
	

}

