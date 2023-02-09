package muthuString;

public class WrapperString {

	public static void main(String[] args) {
		String name = "ViCkY";

		int count = 0;
		for (int i = 0; i < name.length(); i++) 
		{
			if (i % 2 == 0)
		// 	if (i % 2 != 0)   //reverse	
			{
				System.out.print(Character.toUpperCase(name.charAt(i)));
				count++;
			} 
			else 
			{
				System.out.print(name.charAt(i));
			}
		}
		System.out.println();
		System.out.println("no of capital :" + count);

	}

}
