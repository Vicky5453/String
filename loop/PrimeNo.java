package muthu;

public class PrimeNo {

	public static void main(String[] args) {
		int no = 13;
		int count = 0;
		int div = 1; // div=2
		while (div <= no) // (div<no)
		{
			if (no % div == 0) {
				System.out.println(div);
				count++;
			}
			div++;
		}
		System.out.println("no of divisors " + count);

		if (count == 2) // (count==0)
		{
			System.out.println("prime number");
		} 
		else 
		{
			System.out.println("not prime number");
		}
	}

}
