package multithreading;

public class ThreadExample1 extends Thread {
	
	
	 @Override
	    public void run() {
		 int a = 10;
		 int b = 29;
		 int c = a+ b;
		 
		//  System.out.println(c);
		 
		 System.out.println(Thread.currentThread() + " res" + c);
		 
	 }
	
	

}
