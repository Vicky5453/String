package muthuString;

public class ChartoInteger {           // type casting 

	public static void main(String[] args) {
		     String name = "naveen";
		     
		     char ch=name.charAt(0);
		     System.out.println((int)ch);   // relationship ascii value

		      ch=name.charAt(1);
		     System.out.println((int)ch);
		     
		     int l=(int)ch;             
		     l=l-32;                      // small to capital
		     System.out.println(l);
		     System.out.println((char)l);
	}

}
