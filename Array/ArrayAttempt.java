package muthuArray;

public class ArrayAttempt {

	public static void main(String[] args) {
		int[] a1 = { 10, 20, 30 }; // local variable
		ArrayAttempt aa = new ArrayAttempt();

		for (int i = 0; i < a1.length; i++) {
			System.out.print(a1[i]+" ");
		}
		aa.rightshift(a1);

		System.out.println();

		for (int i = 0; i < a1.length; i++) {
			System.out.print(a1[i]+" ");
		}

	}

	private void rightshift(int[] a) {
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;

	}

}
