package exceptionHandling;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		Sample s = new Sample();
		s.display();
		s.add();
		
	}

	private void add() {
		System.out.println(10+10);
		
	}

	private void display() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int no1 = sc.nextInt();
		int no2 = sc.nextInt();
		try 
		{
			System.out.println(no1 / no2); // exception possible area
		} 
		catch (ArithmeticException ae) 
		{
			System.out.println("check no2"); // exception handling area
		}
		
	}

}
