package main;

public class CleverSwap 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int x = 1984;//(0x7c0)
		int y = 2001;//(0x7d1)
		x ^= y^= x^= y;
		System.out.println("x = " + x + "; y = " + y);
		/*
		 * �������Ǵ���������ֵ��
		 * Ϊ�˼��� x^= expr��ֵ���ڼ���expr֮ǰ�ͻ���ȡx��ֵ
		 * 
		 * �ڵ������ʽ�в�Ҫ������ͬ������ֵ����*/
	}

}
