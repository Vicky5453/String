package muthuArray;

public class Minimum {

	public static void main(String[] args) {
		int[] marks = { 50, 40, 100, 78, 80 };
		int min = marks[0];
		int i = 0;
		while (i < marks.length) 
		{
			if (marks[i] < min) {
				min = marks[i];
			}
			i++;
		
		}
		System.out.println("minimum :" + min);

	}

}
