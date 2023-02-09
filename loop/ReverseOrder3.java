package muthu;

public class ReverseOrder3 {        // palindrome

	public static void main(String[] args) {
		  int purse=1234321;
		  int reverse=0;
		  int purse1=purse;       // copy
		  
		  while(purse>0)
		  {
			  int rem=purse%10;
			  System.out.println(rem);
			  reverse=(reverse*10)+rem;
			  purse=purse/10;
		  }
		  System.out.println(reverse);
		  if (purse1==reverse)
		  {
			  System.out.println("palindrome");
		  }
		  else
		  {
			  System.out.println("not palindrome ");
		  }

	}

}
