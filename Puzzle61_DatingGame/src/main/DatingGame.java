package main;

//import java.sql.Date;
import java.util.Calendar;

public class DatingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		cal.set(1999, 12, 31);
		System.out.println(cal.get(Calendar.YEAR) + " ");
		
		//Date d= (Date) cal.getTime();//源程序
		//System.out.println(d.getDay());//源程序
		/*输出2000，而且抛出异常
		 * 程序第一个bug在cal.set(1999,12,31),习惯上我们将第一个个月赋值为1，而在Date中是0，而Cal也是这样。
		 * 所以这个方法是的日历变成1999年的13月31日 然后cal直接替换成下一年
		 * 
		 * 解决方法，可以用11但是容易混淆
		 * 所以就用常量Calendar.DECEMBER*/
	}

}
