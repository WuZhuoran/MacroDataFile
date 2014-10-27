package main;

public class Mod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MODELUS = 3;
		int[] histogram = new int[MODELUS];
		
		int i = Integer.MIN_VALUE;
		
		do
		{
			histogram[Math.abs(i) % MODELUS]++;
		}while(i++ != Integer.MAX_VALUE);
		
		for(int j = 0; j < MODELUS; j++)
		{
			System.out.print(histogram[i] + " ");
		}
		
		/*程序应该打印 1431655765 1431655766 1431655765
		 * 但实际直接抛出异常
		 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: -2
	at main.Mod.main(Mod.java:14)
		   原因在于，对于abs()的使用。
		   根据abs()的定义，总是返回参数绝对值，但是有一种情况情况下例外，就是当参数等于Integer.Min的时候，那么产生的结果和原
		   数相同。
		   所以循环刚开始运行就变成了 -2 的数组索引值
		   
		 解决方案：
		 private static int mod(int i, int modulus)
		 {
		 	int resule = i % modulus;
		 	return result < 0？ result + modulus : result		 }  
		}*/
	}

}
