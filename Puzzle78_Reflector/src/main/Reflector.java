package main;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Reflector 
{

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		Set<String> s = new HashSet<String>();
		s.add("foo");
		Iterator<String> it = s.iterator();
		Method m = it.getClass().getMethod("hasNext");
		System.out.println(m.invoke(it));
	}
	/*程序首先创建一个只有一个元素的集合，然后获得集合的迭代器
	 * 利用反射调用迭代器的hasNext方法，最后打印结果。
	 * hasNEXT应该返回True。
	 * 
	 * 运行结果：
	 * Exception in thread "main" java.lang.IllegalAccessException: Class main.Reflector can not access a member of class java.util.HashMap$HashIterator with modifiers "public final"
	at sun.reflect.Reflection.ensureMemberAccess(Unknown Source)
	at java.lang.reflect.AccessibleObject.slowCheckMemberAccess(Unknown Source)
	at java.lang.reflect.AccessibleObject.checkAccess(Unknown Source)
	at java.lang.reflect.Method.invoke(Unknown Source)
	at main.Reflector.main(Reflector.java:18)
	*  
	*  hasNext方法是公共的，所以它在任何地方都是可以被访问的。呢么为什么非法呢？
	*  这里的问题在在于访问的级别，而在于该方法所在的类型的访问级别。这个类型所扮演的角色和一个普通方法调用中的限定类型是相同的
	*  在这个程序中，该方法是从某个类选择出来的，而这个类是由it.getClass方法返回的Class对象表示的。
	*  而这个getClass方法不是公共的，来源于另外一个包
	*  即，访问位于其他包中的非公共类型的成员不是合法的。
	*  
	*  结论，在使用反射访问某个类型时，请使用表示某种可访问类型的Class对象。
	*  虽然object.getClass().getMethod()很常见，但是确实有问题的。不应该被使用
	*  
	*  使用如下访问方式即可：Method m = Iterator.class.getMethod();*/

}
