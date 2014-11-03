package main;

public class Looper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1. 声明一个变量 使得下面一个循环变成无限循环
		 * while(i == i+1)
		 * {}
		 * 由于无穷大+1还是无穷大 所以只需要使用double的最大值或者是足够大的浮点数
		 * 因为浮点数越大，它与之后的数值之间的间隔越大，当足够大时，即使+1也不会改变值，因为他们之间的空隙变得大于1
		 * 当两个数之间值大于2时，即使+1也不会影响
		 * 对于double类型，大于2^54时，间隔+1无用
		 * 可以使用Math.ulp来表示数值之间的距离*/
		double i = Double.POSITIVE_INFINITY;
		while(i == i+1)
		{//无限循环
		}
		
		/*2.声明一个变量 使得下面一个循环变成无限循环
		 * while(i != i)
		 * {}
		 * 
		 *  IEEE提供的一个不等于任何浮点数包括它自身的值 NaN(Not a Number)
		 *  任何一个浮点操作只要有一个NaN这结果为NaN
		 *  */
		
		double j = Double.NaN;
		while(j != j)
		{//无限循环
		}
		
		/*3.声明一个非浮点数变量 使得下面一个循环变成无限循环
		 * while(i != i + 0)
		 * {}
		 * 
		 * 声明一个非数值变量即可 string
		 * 因为+操作符在非数值类型被重载了*/
		String s = "abcde";
		while(s != s + 0)
		{//无限循环
		}
		
		/*4.声明一个变量 使得下面一个循环变成无限循环
		 * while(i != 0)
		 * {
		 * 	i >>>= 1;
		 * }
		 * >>>= 是无符号右移操作符的赋值操作符
		 * 
		 * 首先为了使得移位合法，必须使用整数类型
		 * 什么一个short = -1即可
		 * 理由 是关于类型的扩大和窄化*/
		short y = -1;
		while(y != 0)
		{
			y >>>= 1;
		}
		
		/*5.声明一个变量 使得下面一个循环变成无限循环
		 * while(i <= j && j <= i && i!= j)
		 * {
		 * }
		 * 
		 * 在JAVA中 新版本5.0之后，对于 >= 等操作符的描述是 每一个操作数都可以转换为基本数值类型
		 * 而JAVA的判等操作符 ==和 != 作用于对象引用时，将会执行引用ID的比较，而不是值得比较
		 * 而<= 和 >= 是值上的比较*/
		
		Integer a = new Integer(0);
		Integer b = new Integer(0);
		while(a <= b && b >= a && a != b)
		{//无线循环
		}
		
		
		/*6.声明一个变量 使得下面一个循环变成无限循环
		 * while(i != 0 && i == -i)
		 * {
		 * }
		 * 由于有-号存在，所以必须是一个数值类型
		 * 有一个数Integer.MIN_VALUE -2^31
		 * 不等于0并且加-号也是本身*/
		
		Integer x = Integer.MIN_VALUE;
		while(x != 0 && x == -x)
		{//无限循环
		}
		
	}

}
