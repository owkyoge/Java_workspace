package ioExamples;

import java.io.CharArrayReader;

import javax.smartcardio.Card;

public class CharArrayReaderExample {

	public static void main(String[] args) {
		CharArrayReader car = null;

		try {
			char[] ary = { 'Y', 'o', 'g', 'i', 'M', 'a', 'r', 't', 'h', 'a', 'n', 'd' };
			car = new CharArrayReader(ary);
			int i = 0;
			while ((i = car.read()) != -1) {
				char ch = (char) i;
				System.out.print(ch + ":");
				System.out.println(i);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			car.close();
		}
	

		 

	}

}
