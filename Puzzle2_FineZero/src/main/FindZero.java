package main;

import java.math.BigDecimal;

public class FindZero {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println(2.00 - 1.10);
		//��ӡ���Ϊ0.899999999999999
		/*
		 * ԭ��1.1������ֲ��ܱ���ȷ��ʾΪһ��double���ͣ���ʾΪ��ӽ�����doubleֵ
		 * ��һ������⣺�������е�С���������ö����Ƹ�������ȷ��ʾ
		 * �����Ƹ�����ڻ��Ҽ���ǳ�������*/
		System.out.printf("%.2f%n", 2.00-1.10);//�����ȷ
		/*����취
		 * ʹ��BigDecimal ��ȷС������*/
		System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.10")));
		
		//������Ҫ��ȷ�𰸵ĵط�������ʹ��float �� double
		//ʹ��int long �� BigDecimal
	}

}
