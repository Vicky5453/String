package collection;

import java.util.Vector;

public class VectorDemo {       // Single Thread----> Vector and Stack

	public static void main(String[] args) {
		Vector vt = new Vector();
		
		vt.add(100);
		vt.add("vicky");
		vt.add(true);
		vt.add(5.5f);
		vt.add(5.345);
		vt.add('d');
		vt.add("vicky");
		
		System.out.println(vt);
		

	}

}
