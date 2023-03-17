package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		 LinkedHashSet al = new  LinkedHashSet();
			
			al.add(100);
			al.add("vicky");
			al.add(true);
			al.add(5.5f);
			al.add(5.345);
			al.add('d');
			al.add("vicky");
			
			System.out.println(al);

	}

}
