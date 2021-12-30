package methodexample;

public class NormaMethod {
	
	
public void m1 () {
		
	}
	 
	public String getName() {
		String name= "Python";
		return name;
	}
	
	public int  getScore() {
		int Score  = 200;
		return Score ;
		
	}
	
	
	public double getSalary() {
		double Salary = 183.18;
		return Salary;
	}
	
	public float getNumber() {
		float number = (float) 18.183;
		return number;
	}
	
	
	
public static void main(String[] args) {
      
	NormaMethod  n1 = new NormaMethod();
	 String name = n1.getName();
	 int Score = n1.getScore();
	 double Salary = n1.getSalary();
	 float number = n1.getNumber();
	 
	 
	 System.out.println(name);
	 System.out.println(Score); 
	 System.out.println(Salary); 
	 System.out.println(number);
	 
	}



}
