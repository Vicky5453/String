package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Television implements Comparable {
	
	int inch,price;
	String category;
	boolean smartTv;
	
	public Television(int inch,int price,String category,boolean smartTv)
	{
		this.inch=inch;
		this.price=price;
		this.category=category;
		this.smartTv=smartTv;
	}

	public static void main(String[] args) {
		Television tv1 = new Television(20,20000,"Mi",false);
		Television tv2 = new Television(40,40000,"Sony",true);
		Television tv3 = new Television(32,30000,"Index",true);
		Television tv4 = new Television(28,25000,"Lg",false);
		
		ArrayList al = new ArrayList();
		al.add(tv1);
		al.add(tv2);
		al.add(tv3);
		al.add(tv4);
	//	System.out.println(al);
			
		Collections.sort(al);
		
		for(Object obj:al)
		{
			System.out.println(obj);
		}

	}
	
	public String toString()
	{
		return this.category+"-->"+this.price+"-->"+this.inch;
	}
  
	
	public int compareTo(Object o)
	{
		int price1=this.price;
		Television tv2 = (Television)o;
		int price2=tv2.price;
		System.out.println(price1+"is compare with"+price2);
		
		if(price1>price2)
		   return +5342;
		else if(price1<price2)
			return -75464;
		
		return 0;
		
		
  /*    String category1=this.category;
		Television tv2 = (Television)o;
		String category2=tv2.category;
		
		int result=tv1.category.compareTo(tv2.category)
		if(result>0)
		   return +5342;
		else if(result<0)
			return -75464;
		
		return 0;
	}
	*/
	}
}
	

