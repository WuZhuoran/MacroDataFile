package main;

public class LastLaugh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("H" + "a");
		System.out.println('H' + 'a');
		
		/*
		 * 输出Ha169
		 * 对于第一个println参数是 一个经过字符串连接之后的字符串，所以输出Ha
		 * 对于第二个，‘H’ 和 'a'都是字符型常量，所以将有两个具有字符型的常量的加法是提升到int类型上实现的
		 * 
		 * 如果想把字符连在一起，可以使用类库*/
		
		StringBuilder sb = new StringBuilder();
		sb.append('H');
		sb.append('a');
		System.out.println(sb);
	}

}
