package main;

public class Strange1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		{
			//Missing m = new Missing();
			
		}catch(NoClassDefFoundError ex)
		{
			System.out.println("Got it!");
		}
	}
	/*
	 * �������41 42�����ļ�Ȼ��������֮ǰɾ������.class�ļ�
	 * ��ô�������������Ϊ��ͬ
	 * 41���׳��쳣
	 * 42��ӡ��Got it*/
}
