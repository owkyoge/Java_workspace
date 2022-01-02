package ioExamples;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class JavaBufferedWriter {

	public static void main(String[] args) throws Exception {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {

			fw = new FileWriter("D:\\eswarrr.txt");
			bw = new BufferedWriter(fw);
			bw.write("MOHAN SAI");
		} catch (Exception e) {

		} finally {
			try {
				bw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

}
