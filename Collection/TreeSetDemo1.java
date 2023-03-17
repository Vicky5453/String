package collection;

import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		
		ts.add("akash");
		ts.add("dinesh");
		ts.add("vicky");
		ts.add("suresh");
		ts.add("fayaz");
	//	System.out.println(ts);
		
		for(Object obj:ts)
		{
			System.out.println(obj);
		}
		
		System.out.println();
		
		
		for(Object obj:ts)    //aproach
		{
			String s = (String)obj;
			if(s.charAt(0)=='s')
			System.out.println(s);
		}

	}

}
