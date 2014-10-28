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

	/*运行结果：一直处于挂起状态。不打印任何。
	 * 问题设计join的实现，在内部，Thread.join方法在表示正在被连接的那个Thread实例上调用Object.wait方法
	 * 这也就在等在期间释放了改对象上面的锁。
	 * 
	 * 原因：WorkerThread类的编写使用了实例上的锁来确保quit方法和keepworking方法互斥，但是这种方法与超类Thread内部对
	 * 锁的用法发生冲突。
	 * 所以，除非有关于某个类的详细说明作为保证。
	 * 对于库的任何调用都可能会产生对wait notify notifyAll方法或者某个同步化方法的调用。
	 * 
	 * 如果你想要获得某个锁的完全控制权，那么就要确定没有任何其他人能够访问到它。
	 * 如果你扩展了库中的某个类，而这个类可能使用了它的锁。
	 * 
	 * 解决方案，直接添加，Object类型的是有lock字段作为锁，并且在quit和keepWorkibng方法中对这个锁对象进行同步。
	 * 如上源代码是没有lock并且syn也是在void前面*/
}
