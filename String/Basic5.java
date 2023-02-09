package muthuString;

public class Basic5 {

	public static void main(String[] args) {
		String s = "balaji";

		 char c = 'a'; 
		 int count=0;

		for (int i = 0; i < s.length(); i++) {

			if (c == s.charAt(i)) 
				
			{
				count++;
				//System.out.println(c);
			}
			
		}
		System.out.println(count);

	}

}
