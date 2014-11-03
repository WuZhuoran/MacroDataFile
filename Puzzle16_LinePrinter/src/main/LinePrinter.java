package main;

public class LinePrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Note: \ u000A is Unicode representation of linefeed(LF)
		char c = 0x000A;
		System.out.println(c);
		
		/*
		 * 注释中  如果\和u之间没有空格，那么这是无法通过编译的
		 * 所以，不要经常使用Unicode转义符*/
	}

}
