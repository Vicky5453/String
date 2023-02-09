package muthuArray;

public class Basic3 {

	public static void main(String[] args) {
		int[] marks = { 50, 40, 100, 78, 80 };

		int i = 0;
		while (i < marks.length) 
		{
			if (marks[i] % 10 == 0) {
				System.out.println(marks[i]);
			}
			i++;

		}

	}

}
