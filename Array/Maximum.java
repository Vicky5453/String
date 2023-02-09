package muthuArray;

public class Maximum {

	public static void main(String[] args) {
		int[] marks = { 50, 60, 100, 78, 80 };
		int max = 0;
		int i = 0;
		while (i < marks.length) 
		{
			if (marks[i] > max) 
			{
				max = marks[i];
			}
			i++;

		}
		System.out.println("maximum :" + max);

	}

}
