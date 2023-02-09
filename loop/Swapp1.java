package muthu;

public class Swapp1 { // swapping number not using third variable

	public static void main(String[] args) {
		int a = 10;
		int b = 3;

		b = b - a;
		a = a + b;
		b = a - b;
		System.out.println(a);
		System.out.println(b);

		/*
		 * a=a+b; b=a-b; a=a-b;
		 * 
		 * System.out.println(a); System.out.println(b);
		 */
		
		
	}
}