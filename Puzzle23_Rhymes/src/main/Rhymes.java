package main;

import java.util.Random;

public class Rhymes 
{
	private static Random rnd = new Random();
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		StringBuffer word = null;
		switch (rnd.nextInt(2)) 
		{
		case 1:
			word = new StringBuffer('P');
		case 2:
			word = new StringBuffer('G');
		default:
			word = new StringBuffer('M');

		}
		
		word.append('a');
		word.append('i');
		word.append('n');
		System.out.println(word);
		
		//输出的是ain 不是Main也不是其他
		/*有3个问题
		 * 1：栅栏柱错误: rnd.nextInt(2)是不包括2的
		 * 2:switch中没有break，这意味着即使能够按照期望，也只会输出M
		 * 3:stringBuffer(char )的构造器压根就不存在
		 * 所以new StringBuffer('G')实际上是吧'G'变为int类型*/
		
		StringBuffer word2 = null;
		switch (rnd.nextInt(3)) 
		{
		case 1:
			word2 = new StringBuffer("P");
			break;
		case 2:
			word2 = new StringBuffer("G");
			break;
		default:
			word2 = new StringBuffer("M");
			break;

		}
		
		word2.append('a');
		word2.append('i');
		word2.append('n');
		System.out.println(word2);
	}

}
