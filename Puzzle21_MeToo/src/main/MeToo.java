package main;

import java.io.File;
import java.util.regex.Matcher;

public class MeToo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(MeToo.class.getName().replaceAll("\\.", File.separator) + ".class");
		//File.separator��ָ��Ϊһ��������String�ֶΣ�����ƽ̨��ص��ļ����ָ���
		/*������׳��쳣
		 *Exception in thread "main" java.lang.IllegalArgumentException: character to be escaped is missing
		at java.util.regex.Matcher.appendReplacement(Unknown Source)
		at java.util.regex.Matcher.replaceAll(Unknown Source)
		at java.lang.String.replaceAll(Unknown Source)
		at main.MeToo.main(MeToo.java:9) */
		
		/*ԭ��String.replaceAll�ĵڶ����ַ�������һ����ͨ���ַ���������һ������ַ���������ַ����еķ�б�ܻ��֮����ַ�����ת��
		 * ʹ�������µķ����������*/
		
		System.out.println(MeToo.class.getName().replaceAll("\\.", Matcher.quoteReplacement(File.separator)) + ".class");
		//���ǿ��Խ��ַ�����Ϊ��Ӧ������ַ���
		System.out.println(MeToo.class.getName().replace(".", File.separator) + ".class");
		//���õĴ���취,����������ﶼ�����ַ�����������
	} 

}
