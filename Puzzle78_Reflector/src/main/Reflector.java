package main;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Reflector 
{

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		Set<String> s = new HashSet<String>();
		s.add("foo");
		Iterator<String> it = s.iterator();
		Method m = it.getClass().getMethod("hasNext");
		System.out.println(m.invoke(it));
	}
	/*�������ȴ���һ��ֻ��һ��Ԫ�صļ��ϣ�Ȼ���ü��ϵĵ�����
	 * ���÷�����õ�������hasNext����������ӡ�����
	 * hasNEXTӦ�÷���True��
	 * 
	 * ���н����
	 * Exception in thread "main" java.lang.IllegalAccessException: Class main.Reflector can not access a member of class java.util.HashMap$HashIterator with modifiers "public final"
	at sun.reflect.Reflection.ensureMemberAccess(Unknown Source)
	at java.lang.reflect.AccessibleObject.slowCheckMemberAccess(Unknown Source)
	at java.lang.reflect.AccessibleObject.checkAccess(Unknown Source)
	at java.lang.reflect.Method.invoke(Unknown Source)
	at main.Reflector.main(Reflector.java:18)
	*  
	*  hasNext�����ǹ����ģ����������κεط����ǿ��Ա����ʵġ���ôΪʲô�Ƿ��أ�
	*  ��������������ڷ��ʵļ��𣬶����ڸ÷������ڵ����͵ķ��ʼ���������������ݵĽ�ɫ��һ����ͨ���������е��޶���������ͬ��
	*  ����������У��÷����Ǵ�ĳ����ѡ������ģ������������it.getClass�������ص�Class�����ʾ�ġ�
	*  �����getClass�������ǹ����ģ���Դ������һ����
	*  ��������λ���������еķǹ������͵ĳ�Ա���ǺϷ��ġ�
	*  
	*  ���ۣ���ʹ�÷������ĳ������ʱ����ʹ�ñ�ʾĳ�ֿɷ������͵�Class����
	*  ��Ȼobject.getClass().getMethod()�ܳ���������ȷʵ������ġ���Ӧ�ñ�ʹ��
	*  
	*  ʹ�����·��ʷ�ʽ���ɣ�Method m = Iterator.class.getMethod();*/

}
