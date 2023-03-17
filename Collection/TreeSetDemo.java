package collection;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		
	/*	ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(3);
		ts.add(2);
		ts.add(40);
		ts.add(50);
		System.out.println(ts);  //assending order
	*/	
		ts.add("akash");
		ts.add("dinesh");
		ts.add("vicky");
		ts.add("suresh");
		ts.add("fayaz");
		System.out.println(ts);  //alphabetic order
		
		System.out.println(ts.first());
		System.out.println(ts.contains("vicky"));
		System.out.println(ts.last());
		System.out.println(ts.pollFirst());
		System.out.println(ts.pollLast());
		System.out.println(ts.subSet("dinesh","vicky"));
		

	}

}
