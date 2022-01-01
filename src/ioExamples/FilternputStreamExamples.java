package ioExamples;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

public class FilternputStreamExamples {

	public static void main(String[] args) {

		File data = null;
		FileInputStream fis = null;
		FilterInputStream filter = null;
		try {

			data = new File("D:\\sai.txt");
			fis = new FileInputStream(data);
			filter = new BufferedInputStream(fis);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
