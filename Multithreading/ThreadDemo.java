package multiThreading;

public class ThreadDemo extends Thread {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getState());
		
		ThreadDemo td = new ThreadDemo();
		System.out.println(td.getState());
		td.start();
		System.out.println(td.getState());

	}

}
