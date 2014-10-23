package main;

import java.util.regex.Pattern;

public class Me {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Me.class.getName().replaceAll(".", "/") + ".class");
	/*一个类的class里面的getName是返回类的名称即 “main.Me”
	 * 这个程序打印的是///////.class
	 * 问题在于，String.replaceAll接受了一个正则表达式作为它的第一个参数,而并非接受一个字符序列字面常量 
	 * 正则表达式"."可以匹配任何单个字符
	 * 如果只想匹配句点符号，那么在正则表达式中的.符号之前需要加一个反斜杠表示转义，并且反斜杠本身也需要一个转义，所以需要两个斜杠*/		
		System.out.println(Me.class.getName().replaceAll("\\.", "/") + ".class");
		
		//新版JAVA已经提供的新的方法
		System.out.println(Me.class.getName().replaceAll(Pattern.quote("."), "/") + ".class");
		//这个方法Pattern返回一个精确定位的正则表达式字符串
		
	}

	

}
