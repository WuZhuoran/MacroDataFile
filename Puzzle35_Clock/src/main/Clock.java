package main;

public class Clock 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int minutes = 0;
		for(int ms = 0; ms < 60 * 60 * 1000; ms++)
		{
			if(ms % 60 * 1000 == 0)
			{
				minutes++;
			}
		}
		System.out.println(minutes);
		/*������ӡ60 ��Ϊ���Ӽ�����
		 * ʵ�ʴ�ӡ60000
		 * �������� ms % 60 * 1000 == 0 �� % ��*���ȼ��ȼ� ������Ҫ�ȼ��� (ms % 60) * 1000 == 0
		 * 
		 * ����+�������⣬���и��õķ���
		 * ��ǡ�������ĳ���*/
	}

}
