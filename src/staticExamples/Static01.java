package staticExamples; 


   class Emp {
	   int eid;
	   int Salary;
	   String name;
	   
	   
	   public void main() {
		   System.out.println(eid +  " : " + Salary + " : " + name);
	   }
	   
	  }


public class Static01 {

	public static void main(String[] args) {
     
		Emp e1 = new Emp();
		e1.eid = 9;
		e1.Salary = 5000;
		e1.name = "Sai";
		
		
		Emp e2 = new Emp();
		e2.eid = 07;
		e2.Salary = 3000;
		e2.name = "Sai";
	   
		e2.name = "Nani"; 
		
		
		e1.main();
		e2.main();
		
		
		
		
		
	}

}
