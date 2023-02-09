package muthu;

public class Lcm {

	public static void main(String[] args) {
		int no1 = 100;
		int no2 = 40;
		int div = 1;
	// 	int small = 0;

	/*	if (no1 < no2) {
			small = div;
		} 
		else {
			small = div;
		}
*/      int small=no1<no2? no1:no2;
		while (div <= small) 
		{
			if (no1 % div == 0 && no2 % div == 0) 
			{
				// System.out.println(div);
				small = div;
			}
			div++;
		}
		System.out.println("lcm is :" + small);
	}

}
