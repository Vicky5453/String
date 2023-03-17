package collection;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
	LinkedList al = new LinkedList();
		
		al.add(100);
		al.add("vicky");
		al.add(true);
		al.add(5.5f);
		al.add(5.345);
		al.add('d');
		al.add("vicky");
		
		System.out.println(al);
		al.remove(5.5f);
		System.out.println(al);
		
		System.out.println(al.indexOf("vicky"));
		System.out.println(al.contains(5.345));
		
		System.out.println(al.lastIndexOf("vicky"));
		System.out.println(al.get(4));
		
		System.out.println(al.size());
		
		LinkedList al2 = new LinkedList();
		al2.addAll(al);
		System.out.println(al2);
		
		al2.add(20);
		al2.add("balaji");
		System.out.println(al2);
		
		al2.removeAll(al);
		System.out.println(al2);
		

	}


	}


