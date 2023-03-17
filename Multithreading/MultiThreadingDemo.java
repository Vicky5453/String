package multiThreading;

public class MultiThreadingDemo {

	public static void main(String[] args) {
		ThreadChild tc = new ThreadChild();
	//	tc.run();
		tc.start();
		
		MultiThreadingDemo md = new MultiThreadingDemo();
		md.display();

	}

	private void display() 
	{
		for(int no=1;no<=5;no++)
		{
			System.out.println("md "+ no);
		}
		
	}

}
