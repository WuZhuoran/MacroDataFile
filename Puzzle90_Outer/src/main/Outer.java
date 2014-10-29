package main;

public class Outer 
{

	class Inner1 extends Outer{}
	class Inner2 extends Inner1{
		public Inner2()//这个为修改版本。原程序没有这个public构造器
		{
			Outer.this.super();
		}
	}
	
}
/*编译错误
 * 因为Inner2的超类本身也是一个内部类
 * 如果想要实例化一个内部类，如雷Inner1
 * 需要提供一个外围类的实例给构造器。一般情况下是显示的传递给构造器的，但是他也可以以expressoin.super的方法通过
 * 超类构造器调用显式的传递
 * 
 * 所以解决问题的方式就是显示的传递外围类的实例*/
