package main;

import java.util.Random;

public class Rhymes 
{
	private static Random rnd = new Random();
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		StringBuffer word = null;
		switch (rnd.nextInt(2)) 
		{
		case 1:
			word = new StringBuffer('P');
		case 2:
			word = new StringBuffer('G');
		default:
			word = new StringBuffer('M');

		}
		
		word.append('a');
		word.append('i');
		word.append('n');
		System.out.println(word);
		
		//�������ain ����MainҲ��������
		/*��3������
		 * 1��դ��������: rnd.nextInt(2)�ǲ�����2��
		 * 2:switch��û��break������ζ�ż�ʹ�ܹ�����������Ҳֻ�����M
		 * 3:stringBuffer(char )�Ĺ�����ѹ���Ͳ�����
		 * ����new StringBuffer('G')ʵ�����ǰ�'G'��Ϊint����*/
		
		StringBuffer word2 = null;
		switch (rnd.nextInt(3)) 
		{
		case 1:
			word2 = new StringBuffer("P");
			break;
		case 2:
			word2 = new StringBuffer("G");
			break;
		default:
			word2 = new StringBuffer("M");
			break;

		}
		
		word2.append('a');
		word2.append('i');
		word2.append('n');
		System.out.println(word2);
	}

}
