package main;

public class Mulitcast 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println((int)(char)(byte) -1 );
		//���65535
		/*
		 * JAVAʹ�û���2�Ĳ�����������㣬����һ��ʼ��int����-1������32λ������λ�ģ���32λintת�͵�8λ��byte������-1
		 * ����char�޷��� byte�з��� ����8λ��byte��char���ǵ������ؿ� ���ڱ����з��ţ����Է���������չ����Ϊ�����char�е�16λ������λ�ˣ�����2^16 - 1
		 * ��charתΪint���ؿ� ����
		 * 
		 * ������� ��һ��charתΪ����������ǣ������ϣ���з�����չ����ôʹ��һ��λ����*/
		
		byte i = -1;
		char c = (char)(i & 0xff);
		System.out.println(c);
	}

}
