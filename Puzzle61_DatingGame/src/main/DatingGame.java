package main;

//import java.sql.Date;
import java.util.Calendar;

public class DatingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		cal.set(1999, 12, 31);
		System.out.println(cal.get(Calendar.YEAR) + " ");
		
		//Date d= (Date) cal.getTime();//Դ����
		//System.out.println(d.getDay());//Դ����
		/*���2000�������׳��쳣
		 * �����һ��bug��cal.set(1999,12,31),ϰ�������ǽ���һ�����¸�ֵΪ1������Date����0����CalҲ��������
		 * ������������ǵ��������1999���13��31�� Ȼ��calֱ���滻����һ��
		 * 
		 * ���������������11�������׻���
		 * ���Ծ��ó���Calendar.DECEMBER*/
	}

}
