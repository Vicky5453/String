package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sample2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		
		try
		{
		int no1 = sc.nextInt();
		int no2 = sc.nextInt();
		 
			System.out.println(no1 / no2); 
		} 
		catch (ArithmeticException ae) 
		{
		//	System.out.println(ae.getMessage());
		//	ae.printStackTrace();
			System.out.println("check no2"); 
		}
		catch (InputMismatchException ime) 
		{
        //  System.out.println(ime.getMessage());
		//  ime.printStackTrace();
			System.out.println("enter only number"); 
		}
		

	}

}
