package multiThreading;

public class MultiThreadDemo extends Thread{

	public static void main(String[] args) {
		MultiThreadDemo mt = new MultiThreadDemo();
		mt.start();
		System.out.println(mt.getId());
		System.out.println(mt.getName());
		mt.setName("vicky");
		System.out.println(mt.getName());
		
		System.out.println(mt.getPriority());
		System.out.println(mt.getState());
		
		System.out.println(mt.MAX_PRIORITY);
		System.out.println(mt.MIN_PRIORITY);
		System.out.println(mt.NORM_PRIORITY);
		
		mt.setPriority(9);
		System.out.println(mt.getPriority());

	}
	public void run()
	{
		System.out.println("hi");
	}

}