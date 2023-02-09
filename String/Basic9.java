package muthuString;

public class Basic9 {         // string to String array

	public static void main(String[] args) {
		String dob = "06/06/1997";
		System.out.println(dob);
		
		String[] players = dob.split("/");
		for(int i=0;i<players.length;i++)
		{
			System.out.println(players[i]);
		}

	}

}
