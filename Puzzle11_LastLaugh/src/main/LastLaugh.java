package main;

public class LastLaugh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("H" + "a");
		System.out.println('H' + 'a');
		
		/*
		 * ���Ha169
		 * ���ڵ�һ��println������ һ�������ַ�������֮����ַ������������Ha
		 * ���ڵڶ�������H�� �� 'a'�����ַ��ͳ��������Խ������������ַ��͵ĳ����ļӷ���������int������ʵ�ֵ�
		 * 
		 * �������ַ�����һ�𣬿���ʹ�����*/
		
		StringBuilder sb = new StringBuilder();
		sb.append('H');
		sb.append('a');
		System.out.println(sb);
	}

}
