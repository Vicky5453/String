package collection;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		String[] names = { "balaji", "vicky", "naveen" };

		Arrays.sort(names);
		for (String name : names) // advance for loop
		{
			System.out.println(name);
		}

	}

}
