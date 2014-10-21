package main;

import java.math.BigDecimal;

public class FindZero {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println(2.00 - 1.10);
		//打印结果为0.899999999999999
		/*
		 * 原因：1.1这个数字不能被精确表示为一个double类型，表示为最接近他的double值
		 * 跟一般的问题：不是所有的小数都可以用二进制浮点数精确表示
		 * 二进制浮点对于货币计算非常不合适*/
		System.out.printf("%.2f%n", 2.00-1.10);//结果正确
		/*解决办法
		 * 使用BigDecimal 精确小数运算*/
		System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.10")));
		
		//对于需要精确答案的地方，避免使用float 和 double
		//使用int long 和 BigDecimal
	}

}
