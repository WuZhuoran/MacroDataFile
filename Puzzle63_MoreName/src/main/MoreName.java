package main;

import java.util.HashMap;
import java.util.Map;

public class MoreName {
	
	private Map<String, String> m = new HashMap<String, String>();
	
//	public void MoreName() //问题在于此，这不是一个构造器。。。构造器没有void
//	{
//		m.put("Mickey", "Mouse");
//		m.put("Mickey", "Mantle");
//	}
	
	public int size()
	{
		return m.size();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
