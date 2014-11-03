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
		/*输出结果为0
		 * f++是无法实现的
		 * 比较一个int和float时，会自动从int到float提升
		 * f的初值非常的大，以至于 加上50转换成 float是 产生的数值和之前一样  即
		 * (float)2000000000 == 2000000050
		 * 所以for循环没有得到执行*/
	}

}
