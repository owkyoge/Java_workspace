package multithreading;

public class Tester1 {

	public static void main(String[] args) {

		
		ThreadExample1 t1 = new ThreadExample1();
		t1.setName("T1");
		
	//	t1.start();
		
		
		
		
        ThreadExample1 t2 = new ThreadExample1();
		

        t2.setName("T2");

//		t2.start();
		
	//	System.out.println("Sucess");
		
		
		RunnableExample r1 = new RunnableExample();
		
	     Thread t = new Thread(r1);
	     
	     t.start();
	     

		
		
		
	}

}
