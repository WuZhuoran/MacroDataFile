package main;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int START = 2000000000;
		int count = 0;
		for(float f = START; f < START + 50; f++)
		{
			count++;
		}
		System.out.println(count);
		/*������Ϊ0
		 * f++���޷�ʵ�ֵ�
		 * �Ƚ�һ��int��floatʱ�����Զ���int��float����
		 * f�ĳ�ֵ�ǳ��Ĵ������� ����50ת���� float�� ��������ֵ��֮ǰһ��  ��
		 * (float)2000000000 == 2000000050
		 * ����forѭ��û�еõ�ִ��*/
	}

}
