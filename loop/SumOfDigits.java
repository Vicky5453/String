package muthu;

public class SumOfDigits {

	public static void main(String[] args) {
		int purse = 123456;
        int SumOfDigits=0;
		while (0 < purse) {
			
			SumOfDigits=SumOfDigits+(purse%10);
			purse = purse / 10;
		}
		System.out.println("sum of digits :"+SumOfDigits);

	}

}
