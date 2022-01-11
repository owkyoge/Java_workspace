package conversion;

public class StringToCharExample3CharArrayMethod {

	public static void main(String[] args) {

		String s = "Subramanyam";
		char [] ch = s.toCharArray();
//		System.out.println(ch);
	
	
		for (int i=0;i<ch.length;i++) {
			System.out.println("char at"+i +"index is:"+ch[i]);
		}
	}

}
