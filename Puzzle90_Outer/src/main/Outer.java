package main;

public class Outer 
{

	class Inner1 extends Outer{}
	class Inner2 extends Inner1{
		public Inner2()//���Ϊ�޸İ汾��ԭ����û�����public������
		{
			Outer.this.super();
		}
	}
	
}
/*�������
 * ��ΪInner2�ĳ��౾��Ҳ��һ���ڲ���
 * �����Ҫʵ����һ���ڲ��࣬����Inner1
 * ��Ҫ�ṩһ����Χ���ʵ������������һ�����������ʾ�Ĵ��ݸ��������ģ�������Ҳ������expressoin.super�ķ���ͨ��
 * ���๹����������ʽ�Ĵ���
 * 
 * ���Խ������ķ�ʽ������ʾ�Ĵ�����Χ���ʵ��*/
