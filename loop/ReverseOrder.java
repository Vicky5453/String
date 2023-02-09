package muthu;

public class ReverseOrder {        // reverse number and no of digits

	public static void main(String[] args) {
		int purse = 123456;
		int NoOfDigits = 0;

		while (0 < purse) {
			System.out.println(purse%10 );
			purse = purse / 10;
			NoOfDigits++;

		}
		System.out.println("no of digits " + NoOfDigits);

	}

}
