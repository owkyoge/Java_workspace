package ioExamples;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import javax.print.DocFlavor.READER;

public class ReaderExample {

	public static void main(String[] args) {
		Reader r = null;
		try {

			r = new FileReader("D:\\newyear.txt");
			int data = r.read();
			while (data != -1) {
				System.out.print((char) data);
				data = r.read();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {

			try {
				r.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
