package main;

public class EscapeRout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("a\u0022.length() + \u0022b".length());
		
		/*
		 * ��ӡ���Ϊ2
		 * ����26Ҳ����16
		 * 
		 * Java�����ַ��������е�Unicodeת���ַ�û���ṩ�κ����⴦������������������̷���֮ǰ���뽫Unicodeת���ַ�ת������������ʾ�ַ���
		 * ���Ե�һ��ת���ַ�\u0022����Ϊ��һ�����ַ���������a�� �Ľ��� ����
		 * ���ڶ����ǡ�b���Ŀ�ʼ ����
		 * ����ӡ���� "a".length() + "b".length"()*/
		
		//�����ϣ��������˫�����ַ������ַ����������ڲ�����ô����ʹ��Unicode 
		//��ʾһ��ת���������һ����б�ܺ������һ��˫���ţ�\"��
		
		System.out.println("a\".length() + \"b".length());
		//��ʱ�����16
	}

}
