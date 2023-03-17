package collection;

public class RuntimeDemo {

	public static void main(String[] args) {
		   Runtime rt =  Runtime.getRuntime();
		   rt.gc();
		   
		   System.out.println(rt.availableProcessors());
		   System.out.println(rt.freeMemory());
		   System.out.println(rt.totalMemory());

	}

}
