package ru.spbstu.telematics.javalectures.lecture11;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class FiltersExample {
	public static void main(String[] args) throws IOException {
		
		OutputStream out = new FileOutputStream("/tmp/filter.data");
		BufferedOutputStream bos = new BufferedOutputStream(out);
//		ZipOutputStream zip = new ZipOutputStream(bos);
		DataOutputStream dos = new DataOutputStream(out);
		
		dos.writeInt(10);
		dos.writeShort(12);
		dos.writeUTF("string val");
		
		dos.close();
		
		InputStream is = new FileInputStream("/tmp/filter.data");
//		ZipInputStream zis = new ZipInputStream(is);
		DataInputStream dis = new DataInputStream(is);
		
		System.out.println(dis.readInt());
		System.out.println(dis.readShort());
		System.out.println(dis.readUTF());
	}
}
