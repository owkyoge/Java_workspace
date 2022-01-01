package ioExamples;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

import javax.swing.plaf.metal.MetalBorders.Flush3DBorder;

public class DataOutputStreamExample {

	public static void main(String[] args) {

		FileOutputStream fout = null;
		DataOutputStream dos = null;

		try {

			fout = new FileOutputStream("D://sai.txt");
			dos = new DataOutputStream(fout);
			dos.writeInt(67);
			dos.writeDouble(12.3d);
			dos.writeLong(200000);
			dos.writeFloat(933.393f);

		}

		catch (Exception e) {
			e.printStackTrace();

		}

		finally {
			try {
				dos.flush();
				fout.close();
				dos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
