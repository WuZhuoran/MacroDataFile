package main;

public class ABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String letters = "ABC";
		char[] numbers = {'1', '2', '3'};
		//System.out.println(letters + "easy as " + numbers); //����ԭ������䣬����ʾwarning
		
		/*
		 * ������ΪABCeasy as [C@15db9742
		 * println��char[]���ذ汾�Ǵ�ӡ��������������������
		 * ����û�ж����ַ������Ӳ������ò�����������Ϊ�ȶ���������������ִ���ַ���ת��tostring���� Ȼ�����������ַ���
		 * ����char[]�Ǽ̳���Object ���Ե���tostring���� ���ص��ǣ�
		 * ����һ���ַ��� �������ö�������������֣���@������ �Լ���ʾ����ɢ������޷���ʮ����������
		 * ��char[]���͵Ķ������getName����ʱ�������ַ�����[C�� */
		
		System.out.println(letters + " easy as " + String.valueOf(numbers));
		
		//����2
		
		System.out.print(letters + " easy as");
		System.out.println(numbers);
		
	}

}
