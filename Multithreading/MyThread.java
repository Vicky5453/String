package multiThreading;

public class MyThread extends Thread {
	
	public void run()
	{
		
		for(int i=1;i<=5;i++)
		{
		//	Thread.yield();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				//e.printStackTrace();
				System.out.println("someone interupted me");
			}
			System.out.println(Thread.currentThread().getState());
			System.out.println("my Thread "+i);
		}
	}

}


