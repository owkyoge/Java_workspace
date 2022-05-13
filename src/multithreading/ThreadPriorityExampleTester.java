package multithreading;

public class ThreadPriorityExampleTester {

	public static void main(String[] args) {

		ThreadPriorityExample1 t = new ThreadPriorityExample1();
		
		t.start();
		
		// Creating threads with the help of ThreadPriorityExample class

		ThreadPriorityExample1 tpe1 = new ThreadPriorityExample1();
		ThreadPriorityExample1 tpe2 = new ThreadPriorityExample1();
		ThreadPriorityExample1 tpe3 = new ThreadPriorityExample1();

		// We did not mention the priority of the thread.  
		// Therefore, the priorities of the thread is 5, the default value  
		
		
		// 1st Thread  
		// Displaying the priority of the thread  
		// using the getPriority() method  
		
		System.out.println(tpe1.getPriority());  // 5 is default 
		System.out.println(tpe2.getPriority());     // 5 is default 
		System.out.println(tpe3.getPriority());   // 5 is default 

		
		
		// Setting priorities of above threads by  
		// passing integer arguments  
		
		
		
		tpe1.setPriority(9);
		tpe2.setPriority(1);
		// tpe2.setPriority(11); // Exception in thread "main"
		// java.lang.IllegalArgumentException
		tpe3.setPriority(3);

		System.out.println("Priority of the thread tpe1 is : "+tpe1.getPriority());    // 9
		System.out.println("Priority of the thread tpe2 is : "+tpe2.getPriority());    // 1
		System.out.println("Priority of the thread tpe3 is : "+tpe3.getPriority());    // 3
		
		
		// Main thread  
		  
		// Displaying name of the currently executing thread   
		System.out.println("Currently Executing The Thread : " + Thread.currentThread().getName());  
		  
		System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());  
		
		Thread.currentThread().setPriority(10);
		  
		System.out.println("Priority of the main thread is : " +Thread.currentThread().getPriority());

	}

}
