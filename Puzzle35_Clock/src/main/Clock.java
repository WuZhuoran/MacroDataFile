package main;

public class Clock 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int minutes = 0;
		for(int ms = 0; ms < 60 * 60 * 1000; ms++)
		{
			if(ms % 60 * 1000 == 0)
			{
				minutes++;
			}
		}
		System.out.println(minutes);
		/*期望打印60 作为分钟计数器
		 * 实际打印60000
		 * 问题在于 ms % 60 * 1000 == 0 中 % 和*优先级等价 所以需要等价于 (ms % 60) * 1000 == 0
		 * 
		 * 除了+括号以外，还有更好的方法
		 * 用恰当命名的常量*/
	}

}
