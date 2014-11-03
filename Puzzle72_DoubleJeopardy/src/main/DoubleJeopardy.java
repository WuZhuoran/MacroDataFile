package main;

class Jeopardy
{
	public static final String PRIZE = "$64,000";
}

public class DoubleJeopardy extends Jeopardy
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println(DoubleJeopardy.PRIZE);
	}
	
	public static final String PRIZE = "2 cents";
	
	/*输出2 cents
	 * 试图隐藏一个final字段
	 * final类型的方法不能被覆写或隐藏
	 * final修饰符对方法和字段而言意味着完全不同的事。
	 * 对于方法，final意味着不能覆写或者隐藏。而对于字段是指该字段不能被赋值超过一次。
	 * 该程序中，final字段的DoubleJepardy.PRIZE隐藏了基类里面的final字段。
	 * 如果你希望保留基类的final字段，那么应该定义一个final static方法return final String
	 * */

}
