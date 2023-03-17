package collection;

import java.util.Comparator;

public class ComparatorDemo implements Comparator {

	public static void main(String[] args) {
		   

	}

	@Override
	public int compare(Object o1, Object o2) 
	{     
/*		Laptop l1=(Laptop) o1;
		Laptop l2=(Laptop) o2;
		if(l1.ram>l2.ram)
			return +5353;
		else if(l1.ram<l2.ram)
			return -6432;
		
		return 0;
*/		
		
        Laptop l1=(Laptop) o1; 
        Laptop l2=(Laptop) o2;
 
		int result =l1.brand.compareTo(l2.brand);
		if(result>0)
			return +5353;
		else if(result<0)
			return -6432;
		
		return 0;
	}

}
