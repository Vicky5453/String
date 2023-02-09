package muthuArray;

import java.util.Scanner;

public class StringCompare {

	public static void main(String[] args) {
		      String[] demo = new String[3];
		      demo[0]="hello";
		      demo[1]="hai";
		      demo[2]="hi";
		      Scanner sc = new Scanner(System.in);
		      System.out.println("enter the values");
		      String name=sc.next();
		       
		      int i=0;
		      boolean got=false;
		      while(i<demo.length)
		      {
		    	  if(name.equals(demo[i]))
		    	  {
		    		  System.out.println("name present");
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
