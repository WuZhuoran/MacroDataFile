package main;

public class IsOdd 
{

	public static void main(String[] args) 
	{
		
		// TODO Auto-generated method stub
		
		for(int i = -10; i < 11; i++)
		{
			System.out.println(i + ": " + isOdd(i)); 
			
		}

	}
	
	public static boolean isOdd(int i) 
	{
		return i % 2 == 1; //�������������޷����
	}
	
	public static boolean isOddNew(int i)
	{
		return i % 2 != 0;
	}
	
	public static boolean isOddForPerformance(int i)
	{
		//ǿ������ʱ��ʹ��&����ȡ��
		return (i & 1) != 0;
	}
	/*
	 * JAVA�е�ȡ�������������Ϊ�������е�int��a �� ����int �� b���������µ�ʽ
	 *  (a / b) * b + (a % b) == a
	 *  ��a����b ����b Ȼ����������͵���a
	 *  ����ζ�ţ���ȡ���������һ��������ʱ�������������������ͬ����������
	 *  
	 *  ��i=������ʱ�� i%2=-1������1 isOdd�����Ǵ����*/
}
