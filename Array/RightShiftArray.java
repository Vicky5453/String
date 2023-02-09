package muthuArray;

public class RightShiftArray {

	public static void main(String[] args) {
		    int[] ar = {22,32,42,52,62};
		    
		    System.out.println("your array before shifting");
		    
		    for(int i=0;i<ar.length;i++)
		    {
		    	System.out.print(ar[i]+"|");
		    }
		    System.out.println();

		   int temp=ar[4];
		   for(int i=ar.length-1;i>=1;i--)
		   {
			   ar[i]=ar[i-1];
		   }
		//    ar[4]=ar[3];
		//    ar[3]=ar[2];
		//    ar[2]=ar[1];
		//    ar[1]=ar[0];
		    ar[0]=temp;
		    
		    System.out.println("your array after shifting");
		    for(int i=0;i<ar.length;i++)
		    {
		    	System.out.print(ar[i]+"|");
		    }

	}

}
