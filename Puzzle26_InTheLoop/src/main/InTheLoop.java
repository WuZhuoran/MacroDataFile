package main;

public class InTheLoop 
{
	public static final int END = Integer.MAX_VALUE;
	public static final int START = END - 100;
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int count = 0;
		for(int i = START; i <= END; i++)
		{
			count++;
		}
		System.out.println(count);
	}
	/*���ѭ�������޵ģ���ѭ������i����MAX_VALUEʱ�������+1��ô�ͻ���MIN_VALUE
	 * �������forѭ��û�н�ֹ
	 * ���Ա�����int i��Ϊlong i�ͺ�
	 * ������ i < END
	 * */
}
