package muthuArray;

public class Sort {     // Bubble sort

	public static void main(String[] args) {
		  int[] a = {40,30,20,10};
		  Sort s = new Sort();
		  
		  for(int j=0;j<a.length-1;j++)
		  {
		  a = s.sorting(a);        // calling statement
		  }
		  
		  System.out.println();
		  for(int i=0;i<a.length;i++)
		  {
			  System.out.println(a[i]);
		  }
		  int no=a.length-1;
		  System.out.println("biggest :"+a[no]);
		  int no1=a.length-2;
		  System.out.println("second biggest :"+a[no1]);
		  int no2=a.length-3;
		  System.out.println("second biggest :"+a[no2]);

	}

	private int[] sorting(int[] a1) {
		  for(int i=0;i<a1.length-1;i++)
		  {
			  if(a1[i]>a1[i+1])
			  {
				  int temp=a1[i];
				  a1[i]=a1[i+1];
				  a1[i+1]=temp;
				 

			  }
		  }
		  return a1;

		
		
	}

}
