package multiThreading;

public class Threaddemo {

	public static void main(String[] args) throws InterruptedException {
		MyThread mt = new MyThread();
		mt.start();
	//	mt.join();
		mt.interrupt();
		 
		Threaddemo td = new Threaddemo();
		td.Display();

	}

	private void Display() 
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Threaddemo "+i);
		}
		
	}

}
