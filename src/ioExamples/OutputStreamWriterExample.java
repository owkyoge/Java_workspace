package ioExamples;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterExample {

	public static void main(String[] args) {

		FileOutputStream fos = null;
		Writer osw = null;

		try {
			fos = new FileOutputStream("D:\\output.txt");
			osw = new OutputStreamWriter(fos);
			osw.write("03012022 - Monday");
		} catch (Exception e) {
	/* e.printStackTrace();*/		e.getMessage();
		} finally {
			try {
				osw.close();
				fos.close();
			} catch (Exception e) {
				/*e.printStackTrace();*/e.getMessage();
			}
		}
	}

}
