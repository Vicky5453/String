package muthu;

public class Basic4 {

	public static void main(String[] args) {
		int no = 2;
		int count = 2;

		while (no <= 240) {
			System.out.println(no);
			no = no * count;
			count++;
		}

	}
	                    // 2 4 12 48 240
}
