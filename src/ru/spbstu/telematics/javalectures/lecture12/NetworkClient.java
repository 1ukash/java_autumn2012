package ru.spbstu.telematics.javalectures.lecture12;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class NetworkClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("localhost", 2048);
		OutputStream outputStream = s.getOutputStream();
		DataOutputStream dos = new DataOutputStream(outputStream);
		
		dos.writeLong(System.currentTimeMillis());
		
		s.close();
		
	}
}
