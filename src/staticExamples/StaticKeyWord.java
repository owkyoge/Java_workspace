package staticExamples;

public class StaticKeyWord {

	public int age = 20;
	public static  String name = "Nani";
	public long no = 0000000000;

	public static void main(String[] args) {
		
		StaticKeyWord s1 = new StaticKeyWord();
		
		
		int age = s1.age;
		String name = StaticKeyWord.name;
		
		System.out.println(age);
		System.out.println(name);
		
	}
}