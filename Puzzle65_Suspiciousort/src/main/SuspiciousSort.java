package main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;


public class SuspiciousSort {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Random rnd = new Random();
		Integer[] arr = new Integer[100];
		
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = rnd.nextInt();
		}
		
		Comparator<Integer> cmp = new Comparator<Integer>() 
		{
			
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1 - o2;
			}
		};
		
		Arrays.sort(arr, cmp);
		System.out.println(order(arr));
		/*输出UNORDERED 应该是降序排序才对
		 * 
		 * 
		 * 问题在于比较器，只是减号-的惯用法从来都是有问题的，定长整数是没有大到可以保存任何两个同等长度的整数只差。
		 * 解决方法： Arrays.sort(arr, Collections.reverseOrder())
		 * 
		 * 不要使用基于减法的比较器！
		 * 除非你能够确保比较的数值之间的差永远不大于Integer.MAX_VALUE*/
	}
	
	enum Order {ASCENDING, DESCENDING, CONSTANT, UNORDERED};
	
	static Order order(Integer[] a)
	{
		boolean ascending = false;
		boolean descending = false;
		
		for(int i = 1; i < a.length; i++)
		{
			ascending |= (a[i] > a[i-1]);
			descending |= (a[i] < a[i-1]);
		}
		
		if(ascending && !descending)
		{
			return Order.ASCENDING;
		}
		if(descending && !ascending)
		{
			return Order.DESCENDING;
		}
		if(!ascending)
		{
			return Order.CONSTANT; //All elements equals
		}
		
		return Order.UNORDERED;
	}

}
