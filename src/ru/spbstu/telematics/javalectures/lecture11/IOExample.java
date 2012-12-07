package ru.spbstu.telematics.javalectures.lecture11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOExample {
	public static void main(String[] args) throws IOException {
		
		input();
		output();
	}

	private static void output() throws FileNotFoundException, IOException {
		OutputStream out = new FileOutputStream("/tmp/file_out.txt");
		out.write(1);
		out.close();
	}
	private static void input() throws FileNotFoundException, IOException {
		InputStream is = new FileInputStream("/tmp/file.txt");
		
		int available = is.available();
		
		byte[] buf = new byte[available];
		is.read(buf);
		String str = new String(buf);
		System.out.println(str);
		is.close();
	}
}
