package muthuString;

public class Basic6 {

	public static void main(String[] args) {
		      String s1 = "abcde";
		      String s2 = "abcd";
		      
		      // s1==s2----->0
		      // s1>s2----->+ve
		      // s1<s2------>-ve
		      
		      int result=s1.compareTo(s2);
		      System.out.println(result);
		      
		      System.out.println(s1.equals(s2));
		      
		      String s3 = s1.concat("fgh");
		      System.out.println(s3);
		      
		      System.out.println(s1.endsWith("cde"));
		      System.out.println(s2.startsWith("abc"));

	}

}
