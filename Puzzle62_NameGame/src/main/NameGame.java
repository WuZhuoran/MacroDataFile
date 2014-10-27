package main;

import java.util.IdentityHashMap;
import java.util.Map;

public class NameGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> m = new IdentityHashMap<String, String>();
		m.put("Mickey", "Mouse");
		m.put("Mickey", "Mantle");
		System.out.println(m.size());
	}
	/*应该输出2，而实际输出1
	 * 这是一个映射关系，而这个不是一个多重映射表，所以第二个名字覆盖了第一个映射
	 * 
	 * 对于IdentityHashMap这个类使用了散列表实现Map接口，它在比较键值的时候实用的是引用等价性而不是值等价。
	 * 也就是说m.put的两次MICKEY如果是两个不同实例的string应该还是打印2才对
	 * 
	 * 因为，语言规范保证了字符串是内存限定的。
	 * 换句话说，相等的字符串常量也同时是相同的
	 * 
	 * 结论，不要使用IdentityHashMap
	 * 除非是你需要基于标识的语义*/

}
