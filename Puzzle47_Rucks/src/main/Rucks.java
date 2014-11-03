package main;

class Counter
{
	private static int count;
	public static void increment()
	{
		count++;
	}
	public static int getCount()
	{
		return count;
	}
}

class Dog extends Counter
{
	public Dog()
	{}
	
	public void woof()
	{
		increment();
	}
}

class Cat extends Counter
{
	public Cat()
	{}
	
	public void meow()
	{
		increment();
	}
}

public class Rucks 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Dog dogs[] = {new Dog(), new Dog()};
		for(int i = 0; i < dogs.length; i++)
		{
			dogs[i].woof();
		}
		
		Cat cats[] = {new Cat(), new Cat(), new Cat() };
		for(int i = 0; i < cats.length; i++)
		{
			cats[i].meow();
		}
		
		System.out.println(Dog.getCount() + " woofs and ");
		System.out.println(Cat.getCount() + " meows");
		/*��̬�����������������Լ������е������й���һ�ݸ���
		 * ������Ȼ��Dog����2�� Cat����3�� ��count������5��*/
	}

}
