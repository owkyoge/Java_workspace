package ioExamples;

import java.io.CharArrayReader;

import javax.smartcardio.Card;

public class CharArrayExample {

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
		/*
		 * finally { try { Card.close(); } catch (Exception e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); } }
		 */

	}

}
