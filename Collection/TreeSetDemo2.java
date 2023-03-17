package collection;

import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
      TreeSet<String> ts = new TreeSet<String>();    // generics--< >
		
		ts.add("akash");
		ts.add("dinesh");
		ts.add("vicky");
		ts.add("suresh");
		ts.add("fayaz");
	
		for(String obj:ts)    //aproach
		{
			String s = (String)obj;    //type casting
			if(s.length()==5)
			System.out.println(obj);
		}

	}

}
