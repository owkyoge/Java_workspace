package oops;



 class B extends A {
	 public static void main (String [] args) {
		 A a = new A();
		 a.m1();
		 
		 B b = new B();
		 a.m1();
         
		 A a1 = new B ();
		 a.m1();

	 }
 }