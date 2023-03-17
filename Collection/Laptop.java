package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Laptop {
	
	int size,price,ram;
	String brand;
	
	
	public Laptop(int size,int price,int ram,String brand)
	{
		this.size=size;
		this.price=price;
		this.ram=ram;
		this.brand=brand;
	}

	public static void main(String[] args) {
		Laptop l1 = new Laptop(20,25000,4,"Lenovo");
		Laptop l2 = new Laptop(40,65000,6,"Dell");
		Laptop l3 = new Laptop(32,50000,5,"Hp");
		Laptop l4 = new Laptop(28,35000,8,"Acer");
		
		ArrayList al = new ArrayList();
		al.add(l1);
		al.add(l2);
		al.add(l3);
		al.add(l4);
		
		ComparatorDemo cd = new ComparatorDemo();
		System.out.println(al);
		
		Collections.sort(al, cd);
		System.out.println(al);
	}
	
	public String toString()
	{
		return this.brand+ " ";
	}

}
