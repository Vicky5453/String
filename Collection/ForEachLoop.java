package collection;

public class ForEachLoop {       // using array very useful for each loop

	public static void main(String[] args) {
		String[] names = {"balaji","suresh","vicky"};
		
		for(String name:names)    // advance for loop
		{
			System.out.println(name);
		}
		
		System.out.println();
		
		
		for(String name:names)    // aproach
		{
			if(name.charAt(0)=='b')
			System.out.println(name);
		}

	
	}

}
