package superexample;

public class ChildDog extends ParentAnimal {

	
		String colour = "Black";
		
	public 	void  printColour() {
			System.out.println(colour);
			System.out.println(super.colour);
		}
		public static void main(String[] args) {

		ChildDog cd = new ChildDog();
		
		cd.printColour();
	}

}
