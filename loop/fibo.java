package muthu;

public class fibo {

	public static void main(String[] args) {
		int first = -1;
		int second = 1;
		int third = 0;

		while (third< 89 ) // (third<=100) print the next number
		{
			third = first + second;
			System.out.println(third);
			first = second;
			second = third;
			
		/*	while ((first+second)< 89 )    //not using third variable 
		  {     
			System.out.println(first+second);
			second=first+second;
		    first=second-first;
			}
	*/	
		}

	}

}
 