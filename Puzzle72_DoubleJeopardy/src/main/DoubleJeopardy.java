package main;

class Jeopardy
{
	public static final String PRIZE = "$64,000";
}

public class DoubleJeopardy extends Jeopardy
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println(DoubleJeopardy.PRIZE);
	}
	
	public static final String PRIZE = "2 cents";
	
	/*���2 cents
	 * ��ͼ����һ��final�ֶ�
	 * final���͵ķ������ܱ���д������
	 * final���η��Է������ֶζ�����ζ����ȫ��ͬ���¡�
	 * ���ڷ�����final��ζ�Ų��ܸ�д�������ء��������ֶ���ָ���ֶβ��ܱ���ֵ����һ�Ρ�
	 * �ó����У�final�ֶε�DoubleJepardy.PRIZE�����˻��������final�ֶΡ�
	 * �����ϣ�����������final�ֶΣ���ôӦ�ö���һ��final static����return final String
	 * */

}
