package ioExamples;

import java.io.StringReader;

public class StringReaderExample {

	public static void main(String[] args) {

		StringReader sr = null;

		try {
			String s = "Yogi Marthand \nMohan Sai";
			sr = new StringReader(s);
			int y = 0;
			while ((y = sr.read()) != -1)
				System.out.print((char) y);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				sr.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
