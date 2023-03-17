package collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortDemo2 {         // sorting String 

	public static void main(String[] args) {
	ArrayList al= new ArrayList();
		
		al.add("naveen");
		al.add("vignesh");
		al.add("abi");
		al.add("yeswanth");
		al.add("balaji");
		
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);


	}

}
