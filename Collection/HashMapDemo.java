package collection;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		hm.put("tamil I", 11);
		hm.put("tamil II", 12);
		hm.put("english I", 13);
		hm.put("english II", 14);
		hm.put("maths", 15);
		hm.put("science", 16);
		hm.put("social", 17);
		System.out.println(hm);
		
		System.out.println(hm.get("tamil I"));
		System.out.println(hm.remove("social"));
		System.out.println(hm);
		System.out.println(hm.containsKey("maths"));
		System.out.println(hm.containsValue(14));
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		


	}

}
