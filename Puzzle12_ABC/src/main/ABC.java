package main;

public class ABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String letters = "ABC";
		char[] numbers = {'1', '2', '3'};
		//System.out.println(letters + "easy as " + numbers); //这是原本的语句，会显示warning
		
		/*
		 * 输出结果为ABCeasy as [C@15db9742
		 * println的char[]重载版本是打印数组所包含的所有内容
		 * 但是没有定义字符串连接操作，该操作符被定义为先对它的两个操作数执行字符串转换tostring（） 然后连接两个字符串
		 * 由于char[]是继承自Object 所以调用tostring方法 返回的是：
		 * 返回一个字符串 包括：该对象所属类的名字，‘@’符号 以及表示对象散列码的无符号十六进制整数
		 * 而char[]类型的对象调用getName方法时，返回字符串“[C” */
		
		System.out.println(letters + " easy as " + String.valueOf(numbers));
		
		//方法2
		
		System.out.print(letters + " easy as");
		System.out.println(numbers);
		
	}

}
