package main;

public class Confusing 
{
	private Confusing(Object o)
	{
		System.out.println("Object!");
	}

	private Confusing(double[] dArray)
	{
		System.out.println("double array");
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		new Confusing(null);
	}
	
	 /* ��ӡdouble array
	 * JAVA�����ؽ���ʽ��2�׶����еġ���һ�׶�ѡȡ���пɻ�ò��ҿ�Ӧ�õķ���������
	 * �ڶ��׶����ڵ�һ�׶�֮��ѡȡ�����ȷ���Ǹ���
	 * ����double��Object�����࣬����Object��ȱ����ȷ��*/

}
