package main;

public class HelloGoodbye 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		{
			System.out.println("Hello World");
			System.exit(0);
		}
		finally
		{
			System.out.println("Goodbye World");
		}
	
		/*exit��ֱ���˳���ǰ�̺߳����������߳�
		 * ����ִ��֮ǰ��Ҫ��������������1.ִ�����еĹҹ���������Щ������ע�ᵽ Runtime.addShutDownHook�ϵ�
		 * 2���ս����йء�
		 * ��Զ��Ҫ����
		 * System.runFinalizersOnExit
		 * Runtime.runFinalizersOnExit*/
	}
	

}
