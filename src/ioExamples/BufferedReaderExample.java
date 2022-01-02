package ioExamples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		try {

			fr = new FileReader("D:\\eswarrr.txt");
			br = new BufferedReader(fr);

			int i;

			while ((i = br.read()) != -1) {
				System.out.print((char) i);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			try {
				fr.close();
				br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

}
