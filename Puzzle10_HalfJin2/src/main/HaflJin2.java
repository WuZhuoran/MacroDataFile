package main;

public class HaflJin2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*给出 i 和 x的声明，使得
		 * x = x + i合法
		 * x += i 不合法*/
		
		/*大部分情况下 += 的要求比 = + 的要求宽松，而有一个例外 string类型
		 * 如果+=左边是string类型，那么+=右边则是可以是任何类型*/
		
		Object x = "Buy";
		String i = "Effective Java!";
		
		x = x + i; //合法
		System.out.println(x);
		x += i; //非法 因为左侧是一个引用类型，右边的string不是
		System.out.println(x);
		
	}

}
