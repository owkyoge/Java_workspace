package multithreading;

public class ThreadPriorityExample2 extends Thread {
	
	
	public void run() {
		System.out.println(" Inside the run() method");
	}

	public static void main(String[] args) {
		
		ThreadPriorityExample2 t = new ThreadPriorityExample2();
		
		t.start();
		
		ThreadPriorityExample2 th1 = new ThreadPriorityExample2();
		
		th1.setPriority(7);

		
		Thread.currentThread().setPriority(9);
		
		System.out.println(Thread.currentThread().getPriority());
		
		System.out.println(t.getPriority());   // default 5
		
		System.out.println(th1.getPriority());


	}

}
