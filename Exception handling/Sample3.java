package exceptionHandling;

import java.util.Scanner;

public class Sample3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int no1 = sc.nextInt();
		int no2 = sc.nextInt();

		try {
			int[] ar = new int[no1];
			System.out.println("array length is :" + ar.length);
			System.out.println(ar[0]);
		} 
		catch (Exception e) // unsolved exception solution of parent class
		{
			System.out.println("something went wrong");
		}
	}

}
