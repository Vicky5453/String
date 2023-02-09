package muthuString;

public class ReplaceLogic {

	public static void main(String[] args) {
		    String player = "dhoni";
		    
		    char[] ch = player.toCharArray();
		    
		    for(int i=0;i<ch.length;i++)
		    {
		    	if(ch[i]=='d')
		    	{
		    		ch[i]='D';
		    	}
		    }
		    for(int i=0;i<ch.length;i++)
		    {
		    	System.out.println(ch[i]);
		    }
		    
		    player = new String(ch);           //charactor to String
		    System.out.println(player);

	}

}
