package main;

public class HaflJin2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*���� i �� x��������ʹ��
		 * x = x + i�Ϸ�
		 * x += i ���Ϸ�*/
		
		/*�󲿷������ += ��Ҫ��� = + ��Ҫ����ɣ�����һ������ string����
		 * ���+=�����string���ͣ���ô+=�ұ����ǿ������κ�����*/
		
		Object x = "Buy";
		String i = "Effective Java!";
		
		x = x + i; //�Ϸ�
		System.out.println(x);
		x += i; //�Ƿ� ��Ϊ�����һ���������ͣ��ұߵ�string����
		System.out.println(x);
		
	}

}
