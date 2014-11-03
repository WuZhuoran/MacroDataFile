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
	/*一直打印PongPing
	 * 多线程程序中，通常观点是每次运行都会有变化，但是本例中 永远打印PongPing
	 * 在同步化的静态方法(ping()) 他会获取与它的Class对象相关联的一个管程锁，所以在上面的程序中，主线程会在创建第二个线程之前获得与pingpong class
	 * 相关联的锁，只要主线程序占有这个锁，第二个线程就不可能执行同步化的静态方法。
	 * 在main方法占用的锁，答应了Ping之后，第二个线程才能执行Pong方法。似乎应该打印PingPong
	 * 
	 * 原因，这不是一个多线程程序，的确创建了第二个线程，但是它从未启动过这个线程。
	 * 相反，主线程会调用哪个新的线程实例的Run方法，这个run方法是在主线程中同步运行的。
	 * 由于一个线程可以重复的获得相同的锁，所以当run调用Pong的时候，主线程就被允许再次获得与PingPong.class
	 * 相关联的锁。
	 * Pong打印了Pong然后回到run方法，而run方法又回到mian方法。
	 * 
	 * 修正，把t.run()改成t.start()*/

}
