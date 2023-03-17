package collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortDemo {             // integer sort

	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		
		al.add(10);
		al.add(30);
		al.add(3);
		al.add(15);
		
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);

	}

}
