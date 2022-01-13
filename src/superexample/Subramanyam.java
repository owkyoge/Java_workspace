package superexample;

public class Subramanyam extends VenkataSwami {

	String nativePlace= "Banaganapalli";
	
	public Subramanyam() {
		super(); 
		System.out.println("This is Sub Class");
	}
	
	public String getOcc() {
		return "DailyWage";
	}
	
	public void print() {
		System.out.println(nativePlace);
		System.out.println(super.nativePlace);
		System.out.println(getOcc());
		System.out.println(super.getOcc());

	}
	
	
	
	
	public static void main(String[] args) {

		Subramanyam s = new Subramanyam();
		
		s.print();
	}

}
