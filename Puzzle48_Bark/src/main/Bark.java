package main;

class Dog 
{
	public static void bark() 
	{
		System.out.println("woof ");
	}
}

class Basenji extends Dog
{
	public static void bark()
	{}
}

public class Bark 
{

	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Dog woofer = new Dog();
		//Dog nipper = new Basenji();
		//woofer.bark();
		//nipper.bark();
	}
	/*
	 * 第一个bark输出woof
	 * 第二个bark也输出woof 但似乎不应该输出woof
	 * 
	 * 原因是因为bark是静态的方法，而对于静态的方法的调用不存在任何动态的分配机制
	 * 当一个程序调用了一个静态的方法，被调用的方法都是在编译时被选定的，而这种选定是基于修饰符的编译器类型而做出来的
	 * 修饰符的编译器类型就是我们给出的方法调用表达式中圆点左边的名字，本例中是 woofer 和 nipper
	 * 
	 * 尽管nipper在运行中是Basenji类型，但编译器只会考虑其编译器类型
	 * 解决方法，去掉static
	 * 编程动态分派，那么就是覆写bark()而不是隐藏*/

}
