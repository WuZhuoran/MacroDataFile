package main;

import java.util.regex.Pattern;

public class Me {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Me.class.getName().replaceAll(".", "/") + ".class");
	/*һ�����class�����getName�Ƿ���������Ƽ� ��main.Me��
	 * ��������ӡ����///////.class
	 * �������ڣ�String.replaceAll������һ��������ʽ��Ϊ���ĵ�һ������,�����ǽ���һ���ַ��������泣�� 
	 * ������ʽ"."����ƥ���κε����ַ�
	 * ���ֻ��ƥ������ţ���ô��������ʽ�е�.����֮ǰ��Ҫ��һ����б�ܱ�ʾת�壬���ҷ�б�ܱ���Ҳ��Ҫһ��ת�壬������Ҫ����б��*/		
		System.out.println(Me.class.getName().replaceAll("\\.", "/") + ".class");
		
		//�°�JAVA�Ѿ��ṩ���µķ���
		System.out.println(Me.class.getName().replaceAll(Pattern.quote("."), "/") + ".class");
		//�������Pattern����һ����ȷ��λ��������ʽ�ַ���
		
	}

	

}
