package main;

class Dog 
{
	public static void bark() 
	{
		System.out.println("woof ");
	}
}

class Basenji extends Dog
{
	public static void bark()
	{}
}

public class Bark 
{

	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Dog woofer = new Dog();
		//Dog nipper = new Basenji();
		//woofer.bark();
		//nipper.bark();
	}
	/*
	 * ��һ��bark���woof
	 * �ڶ���barkҲ���woof ���ƺ���Ӧ�����woof
	 * 
	 * ԭ������Ϊbark�Ǿ�̬�ķ����������ھ�̬�ķ����ĵ��ò������κζ�̬�ķ������
	 * ��һ�����������һ����̬�ķ����������õķ��������ڱ���ʱ��ѡ���ģ�������ѡ���ǻ������η��ı��������Ͷ���������
	 * ���η��ı��������;������Ǹ����ķ������ñ��ʽ��Բ����ߵ����֣��������� woofer �� nipper
	 * 
	 * ����nipper����������Basenji���ͣ���������ֻ�ῼ�������������
	 * ���������ȥ��static
	 * ��̶�̬���ɣ���ô���Ǹ�дbark()����������*/

}
