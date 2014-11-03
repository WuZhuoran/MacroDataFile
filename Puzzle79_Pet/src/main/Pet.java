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
					Pet.this.sleep();//��ʾ����
				}
			}
		}.start();
	}


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		new Pet("Fido", "beef", "Woof").live();
	}
	/*�����޷����룬��Ϊsleep�����Ѿ���Thread�������ˡ�
	 * ������sleep�����ڱ�������д��sleep����
	 * 
	 * �޸ķ�����
	 * 1. ��Pet�е�sleep�������ָĳ���������
	 * 2. ʹ��Pet.this.sleep()��ʽ�ĵ���
	 * 3. ��õķ�����ʹ��Thread(RUnnabke)���������������Thread�ļ̳�*/

}
