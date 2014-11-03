package main;

class Base
{
	public String className = "Base";
}

class Derived extends Base
{
	//private String className = "Derived";
}

public class PrivateMatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(new Derived().className);
	}
	
	/*无法编译，错误是在主类中
	 * 因为className是一个字段所以子类中的className隐藏了基类的className
	 * 而不是覆写。一个字段要隐藏另一个字段，如果隐藏字段的访问修饰符提供的访问权限比被隐藏字段的少，这么做不可取但是合法
	 * 所以上面两个类的定义没有问题
	 * 
	 * 问题在于，PrivateMatter试图访问Derived.className的时候，尽管Base有一个公共字段className，但是这个字段
	 * 没有被继承到Derived类中，因为它被Derived.className隐藏了。而这个字段是private，不可以直接访问。。当然。尽管被隐藏，我们依旧可以
	 * 访问到Base.className
	 * 
	 * ((Base)new Derived()).className
	 * 
	 * 这说明覆写和隐藏之间有非常大的区别，一旦一个方法在子类中被覆写，那么就不能在子类的实力中访问他，除非在内部使用super或者将改实例
	 * 声明为超类类型。*/

}
