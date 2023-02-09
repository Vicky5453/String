package muthuString;

public class NoOfSentencePresent {

	public static void main(String[] args) {
		   String name = "i am going to home. return comming from chennai.";
		      
		      int count=0;
		      for(int i=0;i<name.length();i++)
		      {
		    	  if(name.charAt(i)=='.')
		    		  count++;
		    	   System.out.print(name.charAt(i)+" ");
		      }
		      System.out.println();
		      System.out.println("no of sentence present :"+(count));


	}

}
