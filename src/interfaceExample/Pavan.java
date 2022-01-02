package interfaceExample;

public class Pavan {

	public static void main(String[] args) {

		MarriageBuero m = new Banaganapalli();
		String name = m.name();
		int age = m.age();
		int qual = m.qual();
		String colour = m.colour();
		float height = m.height();

		System.out.println(name);
		System.out.println(age);
		System.out.println(qual);
		System.out.println(colour);
		System.out.println(height);
		System.out.println("       -x-");

		System.out.println("Nandyal==========");
		MarriageBuero m1 = new Nandyal();
		String ndlName = m1.name();
		int ndlAge = m1.age();
		int ndlQual = m1.qual();
		String ndlColour = m1.colour();
		float ndlHeight = m1.height();

		System.out.println(ndlName);
		System.out.println(ndlAge);
		System.out.println(ndlQual);
		System.out.println(ndlColour);
		System.out.println(ndlHeight);
		System.out.println("        -x-");

		System.out.println("Alagadda==========");
		MarriageBuero m2 = new Alagadda();
		String algName = m2.name();
		int algAge = m2.age();
		int algQual = m2.qual();
		String algColour = m2.colour();
		float algHeight = m2.height();

		System.out.println(algName);
		System.out.println(algAge);
		System.out.println(algQual);
		System.out.println(algColour);
		System.out.println(algHeight);
		System.out.println("       -x-");

		MarriageBuero m3 = new Hyderabad();
		String hydName = m3.name();
		int hydAge = m3.age();
		int hydQual = m3.qual();
		String hydColour = m3.colour();
		float hydHeight = m3.height();

		System.out.println("Hyderabad");
		System.out.println(hydName);
		System.out.println(hydAge);
		System.out.println(hydColour);
		System.out.println(hydHeight);

	}

}
