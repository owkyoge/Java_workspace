package stringexample;

public class HashCode1 {
	
	public static void main(String[] args) {
		
		String s1 = "Helloworld";
		
		String s3 = "Yogi";
		
		String s2 = "Helloworld";
		
		//String s3= new String("Helloworld");
		//String s4= new String("Helloworld");

		System.out.println("s1 hashcode --->"+ s1.hashCode());
		System.out.println("s2 hashcode --->"+ s2.hashCode());

		System.out.println(s3.hashCode());
		
		//System.out.println("s3 hashcode --->"+ s3.hashCode());
		//System.out.println("s4 hashcode --->"+ s4.hashCode());


	}

}
