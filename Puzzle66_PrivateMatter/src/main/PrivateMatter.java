package main;

class Base
{
	public String className = "Base";
}

class Derived extends Base
{
	//private String className = "Derived";
}

public class PrivateMatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(new Derived().className);
	}
	
	/*�޷����룬��������������
	 * ��ΪclassName��һ���ֶ����������е�className�����˻����className
	 * �����Ǹ�д��һ���ֶ�Ҫ������һ���ֶΣ���������ֶεķ������η��ṩ�ķ���Ȩ�ޱȱ������ֶε��٣���ô������ȡ���ǺϷ�
	 * ��������������Ķ���û������
	 * 
	 * �������ڣ�PrivateMatter��ͼ����Derived.className��ʱ�򣬾���Base��һ�������ֶ�className����������ֶ�
	 * û�б��̳е�Derived���У���Ϊ����Derived.className�����ˡ�������ֶ���private��������ֱ�ӷ��ʡ�����Ȼ�����ܱ����أ��������ɿ���
	 * ���ʵ�Base.className
	 * 
	 * ((Base)new Derived()).className
	 * 
	 * ��˵����д������֮���зǳ��������һ��һ�������������б���д����ô�Ͳ����������ʵ���з��������������ڲ�ʹ��super���߽���ʵ��
	 * ����Ϊ�������͡�*/

}
