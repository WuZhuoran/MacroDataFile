package main;

import java.util.Timer;
import java.util.TimerTask;

public class Worker extends Thread
{
	private volatile boolean quittingTime = false;
	
	private final Object lock = new Object();
	
	public void run()
	{
		while(!quittingTime)
		{
			pretendToWork();
		}
		System.out.println("Beer is good");
	}
	
	private void pretendToWork()
	{
		try
		{
			Thread.sleep(300);
		}catch(InterruptedException e)
		{
			
		}
	}
	
	void quit() throws InterruptedException
	{
		synchronized (lock) 
		{
			quittingTime = true;
			join();	
		}
		
	}
	
	synchronized void keepWorking()
	{
		synchronized (lock) 
		{
			quittingTime = false;			
		}

	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		final Worker worker = new Worker();
		worker.start();
		
		Timer t = new Timer(true);
		t.schedule(new TimerTask() 
		{
			
			@Override
			public void run() 
			{
				// TODO Auto-generated method stub
				worker.keepWorking();
			}
		}, 500);
		
		Thread.sleep(400);
		worker.quit();
	}

	/*���н����һֱ���ڹ���״̬������ӡ�κΡ�
	 * �������join��ʵ�֣����ڲ���Thread.join�����ڱ�ʾ���ڱ����ӵ��Ǹ�Threadʵ���ϵ���Object.wait����
	 * ��Ҳ���ڵ����ڼ��ͷ��˸Ķ������������
	 * 
	 * ԭ��WorkerThread��ı�дʹ����ʵ���ϵ�����ȷ��quit������keepworking�������⣬�������ַ����볬��Thread�ڲ���
	 * �����÷�������ͻ��
	 * ���ԣ������й���ĳ�������ϸ˵����Ϊ��֤��
	 * ���ڿ���κε��ö����ܻ������wait notify notifyAll��������ĳ��ͬ���������ĵ��á�
	 * 
	 * �������Ҫ���ĳ��������ȫ����Ȩ����ô��Ҫȷ��û���κ��������ܹ����ʵ�����
	 * �������չ�˿��е�ĳ���࣬����������ʹ������������
	 * 
	 * ���������ֱ����ӣ�Object���͵�����lock�ֶ���Ϊ����������quit��keepWorkibng�����ж�������������ͬ����
	 * ����Դ������û��lock����synҲ����voidǰ��*/
}
