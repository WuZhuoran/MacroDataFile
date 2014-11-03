package main;

public class Type 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Type1
		String s = null;
		System.out.println(s instanceof String);//1
		
		//System.out.println(new Type() instanceof String);//2
	
		//Type t = (Type) new Object();//3
		
		/*
		 * 对于1，尽管每一个引用类型来说都是它的子类型，但是instanceof 操作符被定义为在其左操作数是null的时候返回false。所以Type将打印false
		 * 对于2：编译不通过，说明了instanceof操作符在测试一个类的实例的时候，以查看他是否是某个不相关的类的实例，编译失败是因为instanceof的要求：
		 * 如果两个操作数的类型都是类，那么其中一个必须是另一个的子类型
		 * 对于3：通过编译，但是运行时抛出异常。虽然这个转型会很失败，但是instanceof还没有强大到能够洞悉表达式new Object()运行期类型不可能是Type的子类型
		 * */
	}

}
