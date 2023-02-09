package muthu;

public class TwoNumberDivisor {  //greatest common divisor

	public static void main(String[] args) {
		int no1 = 100;
		int no2 = 20;
		int div = 1;
		int last=0;
		while (div <= no1) 
		{
			if (no1 % div == 0 && no2 % div == 0)   
			{
				System.out.println(div);
				last=div;

			}
			div++;
		}
		System.out.println("greatest common divisor is "+last);

	}

}


