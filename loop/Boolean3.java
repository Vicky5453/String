package muthu;

public class Boolean3 {

	public static void main(String[] args) {
		int i=1;
		
		while(i<=15)
		{
			if(i%3==0)
			{
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		//	if(i==15)
		//	{
		//		break;
		//	}
		}

	}

}
