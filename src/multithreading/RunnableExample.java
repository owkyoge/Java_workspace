package multithreading;

public class RunnableExample implements Runnable {

	@Override
	public void run() {

		 int a = 10;
		 int b = 29;
		 int c = a+ b;
		 
		 
		 System.out.println(Thread.currentThread() + " res" + c);
		 
		 
		 
		
	}

}
