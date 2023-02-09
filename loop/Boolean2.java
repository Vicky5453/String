package muthu;

public class Boolean2 {

	public static void main(String[] args) {
		int i = 1;

		while (true) {
			if (i == 5) {
				i++;
				continue;
			}

			System.out.println(i);

			i++;
			if (i == 10) {
				break;
			}

		}
		// System.out.println("after the break");

	}
}
