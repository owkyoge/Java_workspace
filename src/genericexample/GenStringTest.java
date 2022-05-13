package genericexample;

public class GenStringTest {

	public static void main(String[] args) {

		GenString<String> g1 = new GenString<String>("Sai");
		g1.show();        //    The type of ob isjava.lang.String
		System.out.println(g1.getob());      //   Sai
		
		
		
		GenString<Integer> g2 = new GenString<Integer>(66);
		g2.show();         //    The type of ob isjava.lang.Integer
		System.out.println(g2.getob());   //    66
		
		
		
		GenString<Double> g3 = new GenString<Double>(66.6);
		g3.show();          //    The type of ob isjava.lang.Double , ;EM 
		System.out.println(g3.getob());   //       66.6   

		GenString<Double> g4 = new GenString<Double>(66.66);
		g3.show();          //    The type of ob isjava.lang.Double , ;EM 
		System.out.println(g4.getob());   //       66.66   

		
	}

}
