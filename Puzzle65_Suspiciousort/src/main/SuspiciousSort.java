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
		/*���UNORDERED Ӧ���ǽ�������Ŷ�
		 * 
		 * 
		 * �������ڱȽ�����ֻ�Ǽ���-�Ĺ��÷���������������ģ�����������û�д󵽿��Ա����κ�����ͬ�ȳ��ȵ�����ֻ�
		 * ��������� Arrays.sort(arr, Collections.reverseOrder())
		 * 
		 * ��Ҫʹ�û��ڼ����ıȽ�����
		 * �������ܹ�ȷ���Ƚϵ���ֵ֮��Ĳ���Զ������Integer.MAX_VALUE*/
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
