package main;

public class JoyOfHex 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println(Long.toHexString(0x100000000L + 0xcafebabe));
		/*
		 * ����Ӧ����� 1cafebabe
		 * ������Ϊ����һ��Long ���� + һ��int����
		 * ���к�������ͱ�������long���͵�ʱ��0xcafebabe��Ϊһ��int���� �������λ����λ�ˣ�
		 * ����Ϊ��д�ӷ���
		 * 	0xffffffffcafebabeL
		 * +0x0000000100000000L
		 * =0x00000000cafebabeL*/
	}

}
