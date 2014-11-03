package main;

public class ShadesOfGary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(X.Y.Z);
	}

}

class X
{
	static class Y
	{
		static String Z = "Black";
	}
	
	static C Y = new C();
}

class C
{
	String Z = "White";
}

/*打印White
 * 这个程序是模棱两可的，因为类型和变量名重复了。
 * 
 * 有一个规则：当变量名和类名有相同名字并且作用于同域的时候，变量有优先权。 变量名将obscure类型名，相似的
 * 变量名和类型名可以遮掩包名。*/
 