package main;

import java.util.Calendar;

public class Elvis 
{
	public static final Elvis INSTANCE = new Elvis();
	
	private final int beltSize;
	
	private static final int CURRENT_YEAR = Calendar.getInstance().get(Calendar.YEAR);
	
	private Elvis()
	{
		beltSize = CURRENT_YEAR - 1930;
	}
	
	public int beltSize()
	{
		return beltSize;
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Elvis wears a size " + INSTANCE.beltSize() + " belt.");
	}
	
	/*
	 * �����Elvis wears a size -1930 belt.
	 * ���⣺�����ʼ��˳���ѭ�����µģ�Elivs��ĳ�ʼ��ʱͨ���������main�����ĵ��ö������ġ����ȣ��侲̬�ֶα�����ΪĬ��ֵ������INSTANCE�ֶ�����Ϊnull
	 * CURRENT_YEAR ������Ϊ0������������̬�ֶγ�ʪ����������ֵ�˳��ִ�У���һ����̬�ֶ���Intance������ֵ��ͨ�����ù����������
	 * ������������漰��CURRENT_YEAR������beltSize����ͨ����ȡһ����̬�ֶ������ʼ����һ���¼�֮һ�����������Ѿ��ڳ�ʼ��Elvis���ˡ��ݹ�ĳ�ʼ���ᱻֱ�Ӻ��ԡ�����CURRENT_YEAR
	 * �Ծ�������Ĭ��ֵ0 ����belt�Ľ����-1930
	 * ������֮��CURRENT_YEAR�ű�ɵ�ǰ��ȡ��ʱ�䣬�����Ѿ�̫����
	 * 
	 * ��final���͵ľ�̬�ֶα���ʼ��֮ǰ�������Ŷ�ȡ��ֵ�ÿ��ܡ�
	 * 
	 * ��֮��������ĳ�ʼ��ѭ����һЩͨ�õ����ģʽ�ı����ǳ�ʼ��ѭ���ġ�*/

}
