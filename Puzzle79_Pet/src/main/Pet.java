package main;

public class Pet 
{
	public final String name;
	public final String food;
	public final String sound;
	
	public Pet(String name, String food, String sound) 
	{
		super();
		this.name = name;
		this.food = food;
		this.sound = sound;
	}
	
	public void eat()
	{
		System.out.println(name + ": Mmmmmmmm, " + food);
	}
	
	public void play()
	{
		System.out.println(name + ": " + sound + " " + sound);
	}
	
	public void sleep()
	{
		System.out.println(name + ": Zzzzzzz...");
	}

	public void live()
	{
		new Thread()
		{
			public void run()
			{
				while(true)
				{
					eat();
					play();
					//sleep();
					Pet.this.sleep();//显示调用
				}
			}
		}.start();
	}


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		new Pet("Fido", "beef", "Woof").live();
	}
	/*程序无法编译，因为sleep方法已经在Thread里面有了。
	 * 这两个sleep方法遮蔽了我们写的sleep方法
	 * 
	 * 修改方法：
	 * 1. 把Pet中的sleep方法名字改成其他名字
	 * 2. 使用Pet.this.sleep()显式的调用
	 * 3. 最好的方法，使用Thread(RUnnabke)构造器来替代对于Thread的继承*/

}
