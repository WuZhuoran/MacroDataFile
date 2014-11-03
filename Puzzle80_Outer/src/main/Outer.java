package main;

//import java.lang.reflect.Constructor;

public class Outer 
{

	public static void main(String[] args)  throws Exception
	{
		// TODO Auto-generated method stub
		new Outer().greetWorld();
	}
	
	private void greetWorld() throws Exception
	{
		System.out.println(Inner.class.newInstance());
		
//		Constructor c = Inner.class.getConstructor(Outer.class);
//		System.out.println(c.newInstance(Outer.this));
	}
	
	public class Inner
	{
		public String toString()
		{
			return "Hello World";
		}
	}
	/*应该输出Hello World
	 * 而世界上不能编译
	 * Exception in thread "main" java.lang.InstantiationException: main.Outer$Inner
	at java.lang.Class.newInstance(Unknown Source)
	at main.Outer.greetWorld(Outer.java:14)
	at main.Outer.main(Outer.java:9)
Caused by: java.lang.NoSuchMethodException: main.Outer$Inner.<init>()
	at java.lang.Class.getConstructor0(Unknown Source)
	... 3 more*
	 * 
	 * 从5.0开始，关于Class.newInstance的文档叙述：如果那个Class对象“代表一个抽象类，一个接口，一个数组类 一个基本烈类型，或者为空
	 * 或者这个类没有任何空的狗仔起，或者实例化由于某些原因失败，那么就会抛出异常。
	 * 
	 * 有两种情况，要么是Outer.Inner没有空的构造器，
	 * 要没事实例化由于某些原因失败，正如Outer.Inner这种情况，当一个类要么没有任何显式的构造器的时候，JAVA会自动提供一个不带参数的
	 * 公共默认构造器，这个应该是空的构造器
	 * 不过原因还是因为它缺少空的构造器
	 * 
	 * 一个非静态的嵌套类构造器，在编译的时候会将一个隐藏的参数作为它的第一个参数，这个参数表示了他的直接外围实例。
	 * 但你在代码中任何可以让让编译器找到的合适的外围实例方法的地方去调用构造器的时候。这个参数就会被隐式传递进去
	 * 但是上述过程。只适用于普通构造器，也就是不使用反射的情况
	 * 
	 * 在使用反射调用构造器时，这个隐藏的参数就要被显式的传递，而唯一的办法就是用Constructor
	 * 如上
	 * 
	 * 或者是把Inner类改为static类型
	 * 
	 * 避免使用反射来实例化内部类*/

}
