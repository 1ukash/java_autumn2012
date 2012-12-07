package ru.spbstu.telematics.javalectures.lecture11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Set;

public class ReaderAndWriter {
	public static void main(String[] args) throws IOException {
//		FileWriter wr = new FileWriter("/tmp/data.txt");
//		wr.write("string".toCharArray());
//		wr.close();
//		FileReader fr = new FileReader("/tmp/data.txt");
//		char c;
//		while((c = (char) fr.read()) != -1) {
//			System.out.print(c);
//		}
		
		Charset cs = Charset.forName("UTF-8");
		Set<String> aliases = cs.aliases();
		for (String s : aliases) {
			System.out.println(s);
		}
		
		cs = Charset.defaultCharset();
		System.out.println(cs.displayName());
		
		File f = new File("/tmp/dir");
		f.mkdir();
		System.out.println(f.isDirectory());
//		FileInputStream fis = new FileInputStream(f);
	}
}
