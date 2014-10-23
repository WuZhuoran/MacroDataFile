package main;

public class EscapeRout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("a\u0022.length() + \u0022b".length());
		
		/*
		 * 打印结果为2
		 * 不是26也不是16
		 * 
		 * Java对于字符串常量中的Unicode转义字符没有提供任何特殊处理，编译器将程序解析程符号之前，想将Unicode转义字符转换成他们所表示字符。
		 * 所以第一个转义字符\u0022将作为第一个单字符串常量“a” 的结束 引号
		 * 而第二个是“b”的开始 引号
		 * 即打印的是 "a".length() + "b".length"()*/
		
		//如果是希望将两个双引号字符置于字符串常量的内部，那么不能使用Unicode 
		//表示一个转义符序列是一个反斜杠后面紧跟一个双引号（\"）
		
		System.out.println("a\".length() + \"b".length());
		//此时结果是16
	}

}
