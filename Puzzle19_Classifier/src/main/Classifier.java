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
		/*������if֮ǰ�����е�����/*ע�ͷ������if�еĺϲ�
		 * ������ע�ͷ�����Ƕ��*/
		
		return "UNKNOWN ";
	}

}
