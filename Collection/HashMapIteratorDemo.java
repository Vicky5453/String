package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapIteratorDemo {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("tamil I", 11);
		hm.put("tamil II", 12);
		hm.put("english I", 13);
		hm.put("english II", 14);
		hm.put("maths", 15);
		hm.put("science", 16);
		hm.put("social", 17);
		
		Set s = hm.entrySet();
		Iterator i = s.iterator();
		boolean result = i.hasNext();
		while(result)
		{
		//	System.out.println(i.next());
		//	result=i.hasNext();
			
			Map.Entry me = (Map.Entry) i.next();
			if(me.getKey().equals("maths"))
			{
				System.out.println(me.getKey()+" falls on "+me.getValue());
			}
			result = i.hasNext();
		}

	}

}
