package muthuArray;

public class Basic2 {

	public static void main(String[] args) {
		  Basic2 b = new Basic2();
	/*	  String name="hello";
		  System.out.println(name);
	}
	  public String toString()
	  {
		  return "abc";
	  }
*/        		  System.out.println(b.hashCode());
                  System.out.println(b.toString());
}
	public int hashCode()
	{
		return 123;
		
	}
	public String toString()
	{
		return "abcd";
		
	}
}