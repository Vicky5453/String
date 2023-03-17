package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		    
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.iterator();
		
/*		Iterator i = al.iterator();
		boolean result = i.hasNext();
		while(result)
		{
			System.out.println(i.next());
			result = i.hasNext();
		}
*/		
		
		Iterator i = al.iterator();
		boolean result = i.hasNext();
		while(result)
		{
			Integer no = (Integer) i.next();
			if(no%20==0)
			{
				System.out.println(no);
			}
			result = i.hasNext();
		}

		

	}

}
