package muthuArray;

public class LeftShiftTwoElements {

	public static void main(String[] args) {
		int[] ar = { 10, 20, 30, 40, 50 };
		System.out.println("your array before shifting");
		 for(int i=0;i<ar.length;i++)
	    {
	    	System.out.print(ar[i]+"|");
	    }
	   System.out.println();

		int temp1 = ar[0];
		int temp2 = ar[1];
		
		for (int i = 0; i <= 2; i++) 
		{
			ar[i]=ar[i+2];
		}

	//	ar[0] = ar[2];
	//	ar[1] = ar[3];
	//	ar[2] = ar[4];

		ar[3] = temp1;
		ar[4] = temp2;
		System.out.println("your array after shifting");
		 for(int i=0;i<ar.length;i++)
		    {
		    	System.out.print(ar[i]+"|");
		    }

	}

}
