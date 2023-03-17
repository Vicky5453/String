package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Mobile implements Comparable{
	
	
	 static int option=0;
	String model,processor,colour,camera,battery;
	int ram,rom,price;
	

	public Mobile(String string, String string2, String string3, String string4, String string5, int i, int j, int k) {
		// TODO Auto-generated constructor stub
		this.model=model;
		this.processor=processor;
		this.colour=colour;
		this.camera=camera;
		this.battery=battery;
		this.ram=ram;
		this.rom=rom;
		this.price=price;
	}

	public static void main(String[] args) {
		  
		Mobile m1 = new Mobile("Asus","snapdragon 888 Plus","pink","20 mb","4500",4,32,8000);
		Mobile m2 = new Mobile("Mi","octa core 2.4 ghz","red","50 mb","6000",8,128,12000);
		Mobile m3 = new Mobile("samsung","octa core 2 ghz","white","55 mb","5000",5,64,11000);
		Mobile m4 = new Mobile("Poco","octa core 2.3 ghz","black","13 mb","4800",6,32,7500);
		Mobile m5 = new Mobile("Lg","media tek helio g35","blue","48 mb","5500",6,128,20000);
		
		ArrayList al = new ArrayList();
		al.add(m1);
		al.add(m2);
		al.add(m3);
		al.add(m4);
		al.add(m5);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the search option");
		 option = sc.nextInt();
		
		Collections.sort(al);
		
		for(Object o:al)
		{
			System.out.println(o);
		}
	}
	
	public String toString()
	{
		return this.model+"\t"+
	           this.battery+"\t"+
			   this.camera+"\t"+
	           this.colour+"\t"+
			   this.price+"\t"+
	           this.processor+"\t"+
			   this.ram+"\t"+this.rom;
		
	}
	
	public int compareTo(Object o1)
	{
		Mobile m2 = (Mobile) o1;
		
		switch(option)
		{
		case 1:
			return Integer.compare(this.price, m2.price);
		case 2:
			return Integer.compare(this.ram, m2.ram);
		case 3:
			return Integer.compare(this.rom, m2.rom);
			
			
		case 4:
			return this.processor.compareTo (m2.processor);
		case 5:
			return this.camera.compareTo (m2.camera);
		case 6:
			return this.battery.compareTo (m2.battery);
		case 7:
			return this.model.compareTo (m2.model);
		case 8:
			return this.colour.compareTo (m2.colour);
			
		}
		
		return price;
		
	}

}
