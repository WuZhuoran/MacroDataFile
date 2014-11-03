package main;

public class AnimalFarm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String pig = "length: 10";
		final String dog = "length: " + pig.length();
		System.out.println("Animals are equal: " + pig == dog);
		
		//输出为false
		/*
		 * ==操作符不能测试两个对象是否相等，只能测试两个对象是否相同
		 * 并且 + 优先级比==高
		 * 所以输出式子等价于System.out.println(("Animals are equal: " + pig) == dog);
		 * 所以可以将重要的操作数用括号*/
		System.out.println("Animals are equal: " + (pig == dog));
		/* 程序还是不对
		 * 并且代码应该减少对于字符串常量内存限定的机制
		 * 引用的等价性 和 值得等价性 不同
		 * 而==是值得等价性*/
		
		System.out.println("Animals are equal: " + pig.equals(dog));
	}

}
