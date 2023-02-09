package muthuString;

public class UpperCase1 {         // wrapper class using program

	public static void main(String[] args) {
		String name = "I am going to home. Return comming from chennai.";

		for (int i = 0; i < name.length(); i++) 
		{
			if (!Character.isUpperCase(name.charAt(i)))  // lower case
		//	if (Character.isUpperCase(name.charAt(i)))   // upper case 
			{
				System.out.print(name.charAt(i) + " ");
			}

		}

	}
}
