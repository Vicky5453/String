package muthuArray;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int[] marks = {33,44,65,76,88};
		    Scanner sc = new Scanner(System.in);
		    		System.out.println("enter the search");
              int no=sc.nextInt();
              
              int i=0;
              boolean got=false;
              while (i<marks.length)
              {
            	  if(no==marks[i])
            	  {
            		  System.out.println("present at :"+i);
            		  got=true;
            		  break;
            	  }
            	  i++;
              }
              if(got==false)
              {
            	  System.out.println("not present");
              }
	}

}
