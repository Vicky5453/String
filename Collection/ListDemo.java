package collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		String name = "vicky";
		
		List l = new ArrayList();
		System.out.println(l);
		
		l.add(name);
		System.out.println(l);
		
		
		l.add(name);
		name=null;
		System.out.println(name);
		

	}

}
