package main;

public class LongDivision 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//长整数long的整除 被除数表示一天里面的微秒 除数表示一天里面的毫秒
		final long MICROS_PRE_DAY = 24 * 60 * 60 * 1000 * 1000;
		final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;
		System.out.println(MICROS_PRE_DAY / MILLIS_PER_DAY);
		
		final long MICROS_PRE_DAY_LONG = 24L * 60 * 60 * 1000 * 1000;
		final long MILLIS_PRE_DAY_LONG = 24L * 60 * 60 * 1000;
		System.out.println(MICROS_PRE_DAY_LONG / MILLIS_PRE_DAY_LONG);
		/*
		 * 原因：参数MICRO的计算溢出了。这个计算是按照int来执行，只有在执行结束后，其结果才被提升为long， 所以返回的时候 1/200 倍的数值，
		 * 由于所有的×在一起的数值都是int类型，所以结果按照int类型然后再放入long中
		 * 
		 * 解决办法：加一个L*/
	}

}
