package main;

import java.util.IdentityHashMap;
import java.util.Map;

public class NameGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> m = new IdentityHashMap<String, String>();
		m.put("Mickey", "Mouse");
		m.put("Mickey", "Mantle");
		System.out.println(m.size());
	}
	/*Ӧ�����2����ʵ�����1
	 * ����һ��ӳ���ϵ�����������һ������ӳ������Եڶ������ָ����˵�һ��ӳ��
	 * 
	 * ����IdentityHashMap�����ʹ����ɢ�б�ʵ��Map�ӿڣ����ڱȽϼ�ֵ��ʱ��ʵ�õ������õȼ��Զ�����ֵ�ȼۡ�
	 * Ҳ����˵m.put������MICKEY�����������ͬʵ����stringӦ�û��Ǵ�ӡ2�Ŷ�
	 * 
	 * ��Ϊ�����Թ淶��֤���ַ������ڴ��޶��ġ�
	 * ���仰˵����ȵ��ַ�������Ҳͬʱ����ͬ��
	 * 
	 * ���ۣ���Ҫʹ��IdentityHashMap
	 * ����������Ҫ���ڱ�ʶ������*/

}
