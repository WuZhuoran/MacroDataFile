package main;

//import java.lang.reflect.Constructor;

public class Outer 
{

	public static void main(String[] args)  throws Exception
	{
		// TODO Auto-generated method stub
		new Outer().greetWorld();
	}
	
	private void greetWorld() throws Exception
	{
		System.out.println(Inner.class.newInstance());
		
//		Constructor c = Inner.class.getConstructor(Outer.class);
//		System.out.println(c.newInstance(Outer.this));
	}
	
	public class Inner
	{
		public String toString()
		{
			return "Hello World";
		}
	}
	/*Ӧ�����Hello World
	 * �������ϲ��ܱ���
	 * Exception in thread "main" java.lang.InstantiationException: main.Outer$Inner
	at java.lang.Class.newInstance(Unknown Source)
	at main.Outer.greetWorld(Outer.java:14)
	at main.Outer.main(Outer.java:9)
Caused by: java.lang.NoSuchMethodException: main.Outer$Inner.<init>()
	at java.lang.Class.getConstructor0(Unknown Source)
	... 3 more*
	 * 
	 * ��5.0��ʼ������Class.newInstance���ĵ�����������Ǹ�Class���󡰴���һ�������࣬һ���ӿڣ�һ�������� һ�����������ͣ�����Ϊ��
	 * ���������û���κοյĹ����𣬻���ʵ��������ĳЩԭ��ʧ�ܣ���ô�ͻ��׳��쳣��
	 * 
	 * �����������Ҫô��Outer.Innerû�пյĹ�������
	 * Ҫû��ʵ��������ĳЩԭ��ʧ�ܣ�����Outer.Inner�����������һ����Ҫôû���κ���ʽ�Ĺ�������ʱ��JAVA���Զ��ṩһ������������
	 * ����Ĭ�Ϲ����������Ӧ���ǿյĹ�����
	 * ����ԭ������Ϊ��ȱ�ٿյĹ�����
	 * 
	 * һ���Ǿ�̬��Ƕ���๹�������ڱ����ʱ��Ὣһ�����صĲ�����Ϊ���ĵ�һ�����������������ʾ������ֱ����Χʵ����
	 * �����ڴ������κο������ñ������ҵ��ĺ��ʵ���Χʵ�������ĵط�ȥ���ù�������ʱ����������ͻᱻ��ʽ���ݽ�ȥ
	 * �����������̡�ֻ��������ͨ��������Ҳ���ǲ�ʹ�÷�������
	 * 
	 * ��ʹ�÷�����ù�����ʱ��������صĲ�����Ҫ����ʽ�Ĵ��ݣ���Ψһ�İ취������Constructor
	 * ����
	 * 
	 * �����ǰ�Inner���Ϊstatic����
	 * 
	 * ����ʹ�÷�����ʵ�����ڲ���*/

}
