package main;

/*
 *from F:\testRoot\apps\a1\&unit.....*/

public class TestHello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Hell");
		System.out.println("o world");
		
		/*注释中包含\ u 时是很麻烦的，因为这是是个Unicode转义字符的开始，如果后面没有4个数字 那么这是病构 的转义，编译器不给通过
		 * 所以在JAVA注释中，使用HTML实体转义来代替Unicode转义字符*/
	}

}
