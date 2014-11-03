package main;

public class Classifier {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println(classify('n') + classify('+') + classify('2'));
	}
	
	static String classify(char ch)
	{
		if("0123456789".indexOf(ch) >= 0)
			return "NUMERAL ";
		if("abcdefghigklmnopqrstuvwxyz".indexOf(ch) >= 0)
			return "LETTER ";
		if("+-*/&!=".indexOf(ch) >= 0)
			return "OPERATOR ";
		/*第三个if之前不能有单独的/*注释符，会和if中的合并
		 * 即，块注释符不能嵌套*/
		
		return "UNKNOWN ";
	}

}
