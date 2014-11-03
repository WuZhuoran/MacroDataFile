package main;

import java.util.Calendar;

public class Elvis 
{
	public static final Elvis INSTANCE = new Elvis();
	
	private final int beltSize;
	
	private static final int CURRENT_YEAR = Calendar.getInstance().get(Calendar.YEAR);
	
	private Elvis()
	{
		beltSize = CURRENT_YEAR - 1930;
	}
	
	public int beltSize()
	{
		return beltSize;
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Elvis wears a size " + INSTANCE.beltSize() + " belt.");
	}
	
	/*
	 * 输出：Elvis wears a size -1930 belt.
	 * 问题：由类初始化顺序的循环导致的，Elivs类的初始化时通过虚拟机对main方法的调用而触发的。首先，其静态字段被设置为默认值，其中INSTANCE字段设置为null
	 * CURRENT_YEAR 被设置为0，接下来，静态字段除湿器按照起出现的顺序执行，第一个静态字段是Intance，它的值是通过调用构造器计算的
	 * 这个构造器会涉及用CURRENT_YEAR来计算beltSize，。通常读取一个静态字段是类初始化的一个事件之一，但是我们已经在初始化Elvis类了。递归的初始化会被直接忽略。所以CURRENT_YEAR
	 * 仍旧是他的默认值0 所以belt的结果是-1930
	 * 而在这之后，CURRENT_YEAR才变成当前获取的时间，但是已经太晚了
	 * 
	 * 在final类型的静态字段被初始化之前，存在着读取其值得可能。
	 * 
	 * 总之，担心类的初始化循环，一些通用的设计模式的本质是初始化循环的。*/

}
