package main;

import java.io.File;
import java.util.regex.Matcher;

public class MeToo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(MeToo.class.getName().replaceAll("\\.", File.separator) + ".class");
		//File.separator被指定为一个公共的String字段，包含平台相关的文件名分隔符
		/*结果：抛出异常
		 *Exception in thread "main" java.lang.IllegalArgumentException: character to be escaped is missing
		at java.util.regex.Matcher.appendReplacement(Unknown Source)
		at java.util.regex.Matcher.replaceAll(Unknown Source)
		at java.lang.String.replaceAll(Unknown Source)
		at main.MeToo.main(MeToo.java:9) */
		
		/*原因，String.replaceAll的第二个字符串不是一个普通的字符串，而是一个替代字符串，替代字符串中的反斜杠会把之后的字符进行转义
		 * 使用两个新的方法解决问题*/
		
		System.out.println(MeToo.class.getName().replaceAll("\\.", Matcher.quoteReplacement(File.separator)) + ".class");
		//这是可以将字符串改为对应的替代字符串
		System.out.println(MeToo.class.getName().replace(".", File.separator) + ".class");
		//更好的处理办法,把所有替代物都当作字符串常量处理
	} 

}
