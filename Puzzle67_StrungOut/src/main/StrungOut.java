package main;

class String
{
	private final java.lang.String s;
	
	public String(java.lang.String s)
	{
		this.s = s;
	}
	
	public java.lang.String toString()
	{
		return s;
	}
}

public class StrungOut 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s = new String("Hello World");
		System.out.println(s);
	}
	/*�������У�������ʾΪ��
	 * ����: ���� main.StrungOut ���Ҳ��� main ����, �뽫 main ��������Ϊ:
   public static void main(String[] args)
   
	 ����StrungOut��һ��main��������ʵ���� ��������Ҫһ��String���͵Ĳ�����
	 ���������Ƕ�����String�������String�Ͳ���java.lang�����String��
	 
	 ���ۣ���Զ��Ҫ����java.lang������ࡣ
	 
	 ���������޸����Լ��������������*/

}
