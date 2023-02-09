package muthuString;

public class UpperCase {      // wrapper class using program

	public static void main(String[] args) {
		String name = "I am going to home. Return comming from chennai.";

		int count = 0;
		for (int i = 0; i < name.length(); i++) 
		{
			char ch = name.charAt(i);
			boolean result = Character.isUpperCase(ch);

			if (result == true)

			{
				count++;
				System.out.print(ch + " ");
			}

		}
		System.out.println();
		System.out.println("no of sentence present :" + (count));

	}

}
