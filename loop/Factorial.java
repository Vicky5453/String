package muthu;

public class Factorial {

	public static void main(String[] args) {
		int no = 1;
		int fact = 1;

		while (no <= 5) 
		{
			fact = fact * no;
			no++;
		}
		System.out.println(fact);

	}

}
