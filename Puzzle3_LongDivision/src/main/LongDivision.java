package main;

public class LongDivision 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//������long������ ��������ʾһ�������΢�� ������ʾһ������ĺ���
		final long MICROS_PRE_DAY = 24 * 60 * 60 * 1000 * 1000;
		final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;
		System.out.println(MICROS_PRE_DAY / MILLIS_PER_DAY);
		
		final long MICROS_PRE_DAY_LONG = 24L * 60 * 60 * 1000 * 1000;
		final long MILLIS_PRE_DAY_LONG = 24L * 60 * 60 * 1000;
		System.out.println(MICROS_PRE_DAY_LONG / MILLIS_PRE_DAY_LONG);
		/*
		 * ԭ�򣺲���MICRO�ļ�������ˡ���������ǰ���int��ִ�У�ֻ����ִ�н����������ű�����Ϊlong�� ���Է��ص�ʱ�� 1/200 ������ֵ��
		 * �������еġ���һ�����ֵ����int���ͣ����Խ������int����Ȼ���ٷ���long��
		 * 
		 * ����취����һ��L*/
	}

}
