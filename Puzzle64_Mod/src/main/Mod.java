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
		
		/*����Ӧ�ô�ӡ 1431655765 1431655766 1431655765
		 * ��ʵ��ֱ���׳��쳣
		 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: -2
	at main.Mod.main(Mod.java:14)
		   ԭ�����ڣ�����abs()��ʹ�á�
		   ����abs()�Ķ��壬���Ƿ��ز�������ֵ��������һ�������������⣬���ǵ���������Integer.Min��ʱ����ô�����Ľ����ԭ
		   ����ͬ��
		   ����ѭ���տ�ʼ���оͱ���� -2 ����������ֵ
		   
		 ���������
		 private static int mod(int i, int modulus)
		 {
		 	int resule = i % modulus;
		 	return result < 0�� result + modulus : result		 }  
		}*/
	}

}
