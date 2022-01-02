package ioExamples;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) {
		FileWriter filew = null;
		try {
			filew = new FileWriter("D:\\yogi.txt");
			filew.write("Welcome to New Year 2022");

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			try {
				filew.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

}
