package muthu;

public class Pattern1 {

	public static void main(String[] args) {

		int end = 5;
		while (end >= 1) 
		{
			for (int val = 1; val <= end; val++) 
			{
				System.out.print(val);
			}
			System.out.println();
			end--;
		}

	}
}
