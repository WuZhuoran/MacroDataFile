package main;

public class AnimalFarm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String pig = "length: 10";
		final String dog = "length: " + pig.length();
		System.out.println("Animals are equal: " + pig == dog);
		
		//���Ϊfalse
		/*
		 * ==���������ܲ������������Ƿ���ȣ�ֻ�ܲ������������Ƿ���ͬ
		 * ���� + ���ȼ���==��
		 * �������ʽ�ӵȼ���System.out.println(("Animals are equal: " + pig) == dog);
		 * ���Կ��Խ���Ҫ�Ĳ�����������*/
		System.out.println("Animals are equal: " + (pig == dog));
		/* �����ǲ���
		 * ���Ҵ���Ӧ�ü��ٶ����ַ��������ڴ��޶��Ļ���
		 * ���õĵȼ��� �� ֵ�õȼ��� ��ͬ
		 * ��==��ֵ�õȼ���*/
		
		System.out.println("Animals are equal: " + pig.equals(dog));
	}

}
