package collection;

import java.util.ArrayList;

public class sample1 {

	public static void main(String[] args) {
	ArrayList al = new ArrayList();
		
		al.add(100);
		al.add("vicky");
		al.add(true);
		al.add(5.5f);
		al.add(5.345);
		al.add('d');
		System.out.println(al);
		

		Object[] ob = al.toArray();
		for(int i=0;i<ob.length;i++)
		{
			System.out.println(ob[i]);
		}
		
		

	}

}
