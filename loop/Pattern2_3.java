package muthu;

public class Pattern2_3 {

	public static void main(String[] args) {
		for (int x = 1; x <= 5; x++)

		{

			for (int i = 1; i <= x; i++) {
				System.out.print(x+" ");
			}
			for(int j=1;j<=6-x;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
