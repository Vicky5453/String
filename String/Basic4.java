package muthuString;

public class Basic4 {

	public static void main(String[] args) {
		    String str = "abcdefghd";
		    
		    System.out.println(str.length());
		    System.out.println(str.charAt(3));
		    System.out.println(str.charAt(0));
		    System.out.println(str.contains("f"));
		    System.out.println(str.contains("abc"));
		    System.out.println(str.contains("ghi"));
		    System.out.println(str.indexOf("d"));
		    System.out.println(str.lastIndexOf("d"));
		    System.out.println(str.toLowerCase());
		    System.out.println(str.toUpperCase());
		    
		    char[] ch =str.toCharArray();
		    		
			for(int i=0;i<ch.length;i++)
    		{
    			System.out.println(ch[i]);
    		}

	}

}
