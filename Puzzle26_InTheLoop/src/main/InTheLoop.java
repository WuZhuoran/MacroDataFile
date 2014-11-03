package main;

public class InTheLoop 
{
	public static final int END = Integer.MAX_VALUE;
	public static final int START = END - 100;
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int count = 0;
		for(int i = START; i <= END; i++)
		{
			count++;
		}
		System.out.println(count);
	}
	/*这个循环是无限的，但循环索引i到达MAX_VALUE时，如果再+1那么就会变成MIN_VALUE
	 * 所以这个for循环没有截止
	 * 所以本例把int i改为long i就好
	 * 或者是 i < END
	 * */
}
