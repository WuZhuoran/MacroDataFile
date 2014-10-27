package hack;

import click.CodeTalk;

public class TypeIt 
{
	private static class ClickIt extends CodeTalk
	{
//		void printMessage()
//		{
//			System.out.println("Hack");
//		}
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ClickIt clickIt = new ClickIt();
		clickIt.doIt();
	}

}

/*程序打印Click 似乎应该打印Hack因为重写的方法print
 * 而实际上是没有覆写的。一个包私有的方法是不能被位于另外一包里面的某个方法覆写。
 * 
 * 如果你想覆写，那么就必须在CodeTale里面的方法前面加上public 或者 protected修饰符*/
