package main;

public class PingPang 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Thread t = new Thread()
		{
			public void run()
			{
				pong();
			}
		};
		
	    t.run();
		//t.start();
		System.out.println("Ping");
	}
	
	static synchronized void pong()
	{
		System.out.print("Pong");
	}
	/*һֱ��ӡPongPing
	 * ���̳߳����У�ͨ���۵���ÿ�����ж����б仯�����Ǳ����� ��Զ��ӡPongPing
	 * ��ͬ�����ľ�̬����(ping()) �����ȡ������Class�����������һ���ܳ���������������ĳ����У����̻߳��ڴ����ڶ����߳�֮ǰ�����pingpong class
	 * �����������ֻҪ���߳���ռ����������ڶ����߳̾Ͳ�����ִ��ͬ�����ľ�̬������
	 * ��main����ռ�õ�������Ӧ��Ping֮�󣬵ڶ����̲߳���ִ��Pong�������ƺ�Ӧ�ô�ӡPingPong
	 * 
	 * ԭ���ⲻ��һ�����̳߳��򣬵�ȷ�����˵ڶ����̣߳���������δ����������̡߳�
	 * �෴�����̻߳�����ĸ��µ��߳�ʵ����Run���������run�����������߳���ͬ�����еġ�
	 * ����һ���߳̿����ظ��Ļ����ͬ���������Ե�run����Pong��ʱ�����߳̾ͱ������ٴλ����PingPong.class
	 * �����������
	 * Pong��ӡ��PongȻ��ص�run��������run�����ֻص�mian������
	 * 
	 * ��������t.run()�ĳ�t.start()*/

}
